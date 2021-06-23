package alcohol.drink.liquor.delivery.online.world.beer.map.view.fragment

import alcohol.drink.liquor.delivery.online.world.beer.map.view.mapsDataFiles.GetNearbyPlacesData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.R
import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.os.Build
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import java.io.IOException


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MapsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MapsFragment : Fragment(), OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks,
    GoogleApiClient.OnConnectionFailedListener, LocationListener, View.OnClickListener {

    private var mMap: GoogleMap? = null
    private var client: GoogleApiClient? = null
    private var locationRequest: LocationRequest? = null
    private var lastlocation: Location? = null
    private var currentLocationMarker: Marker? = null
    val REQUEST_LOCATION_CODE = 99
    var PROXIMITY_RADIUS = 10000
    var latitude = 0.0
    var longitude = 0.0
    lateinit var txtPlace : TextView
    private lateinit var fusedLocationClient: FusedLocationProviderClient




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkLocationPermission()
        }
        val mapFragment = childFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())

        val btnSearch = view.findViewById<Button>(R.id.btnSearch)
        val btnHospitals = view.findViewById<Button>(R.id.btnHospitals)
        val btnBanks = view.findViewById<Button>(R.id.btnBanks)
        val btnRestaurants = view.findViewById<Button>(R.id.btnRestaurants)
        val btnSchools = view.findViewById<Button>(R.id.btnSchools)
        val btnHotels = view.findViewById<Button>(R.id.btnHotels)
        txtPlace = view.findViewById<EditText>(R.id.txtPlace)

        btnSearch.setOnClickListener(this)
        btnHospitals.setOnClickListener(this)
        btnBanks.setOnClickListener(this)
        btnRestaurants.setOnClickListener(this)
        btnSchools.setOnClickListener(this)
        btnHotels.setOnClickListener(this)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            REQUEST_LOCATION_CODE -> if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (context?.let {
                        ContextCompat.checkSelfPermission(
                            it,
                            Manifest.permission.ACCESS_FINE_LOCATION
                        )
                    } != PackageManager.PERMISSION_GRANTED
                ) {
                    if (client == null) {
                        bulidGoogleApiClient()
                    }
                    mMap!!.isMyLocationEnabled = true
                }
            } else {
                Toast.makeText(context, "Permission Denied", Toast.LENGTH_LONG).show()
            }
        }
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE //changes the type of map
        if (context?.let {
                ContextCompat.checkSelfPermission(
                    it,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            } == PackageManager.PERMISSION_GRANTED
        ) {
            bulidGoogleApiClient()
            mMap!!.isMyLocationEnabled = true
        }
    }

    @Synchronized
    protected fun bulidGoogleApiClient() {
        client = context?.let {
            GoogleApiClient.Builder(it)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build()
        }
        client?.connect()
    }

    override fun onLocationChanged(location: Location) {
        latitude = location.latitude
        longitude = location.longitude
        lastlocation = location
        if (currentLocationMarker != null) {
            currentLocationMarker!!.remove()
        }
        Log.d("lat = ", "" + latitude)
        val latLng = LatLng(location.latitude, location.longitude)
        val markerOptions = MarkerOptions()
        markerOptions.position(latLng)
        markerOptions.title("Current Location")
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        currentLocationMarker = mMap!!.addMarker(markerOptions)
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(latLng))
        mMap!!.animateCamera(CameraUpdateFactory.zoomBy(15f))
        if (client != null) {
            if (ActivityCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            fusedLocationClient.lastLocation.addOnCompleteListener {
                val location = it.result
                if (location != null) {
                    // 4
                    val latLng = LatLng(location.latitude, location.longitude)
                    // 5
                    mMap?.addMarker(MarkerOptions().position(latLng)
                        .title("You are here!"))
                    // 6
                    val update = CameraUpdateFactory.newLatLngZoom(latLng, 16.0f)
                    // 7
                    mMap?.moveCamera(update)
                } else {
                    // 8
                    Log.e("TAG", "No location found")
                }
            }
        }
    }

    override fun onClick(v: View) {
        val dataTransfer = arrayOfNulls<Any>(2)
        val getNearbyPlacesData = GetNearbyPlacesData()
        when (v.id) {
            R.id.btnSearch -> {

                val location = txtPlace.text.toString()
                val addressList: List<Address>
                if (location !== "") {
                    val geocoder = Geocoder(context)
                    try {
                        addressList = geocoder.getFromLocationName(location, 5)
                        if (addressList != null) {
                            var i = 0
                            while (i < addressList.size) {
                                val latLng = LatLng(addressList[i].latitude, addressList[i].longitude)
                                val markerOptions = MarkerOptions()
                                markerOptions.position(latLng)
                                markerOptions.title(location)
                                mMap!!.addMarker(markerOptions)
                                mMap!!.moveCamera(CameraUpdateFactory.newLatLng(latLng))
                                mMap!!.animateCamera(CameraUpdateFactory.zoomTo(15f))
                                i++
                            }
                        }
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }
            R.id.btnHospitals -> {
                mMap!!.clear()
                val Hospital = "hospital"
                val url = getUrl(latitude, longitude, Hospital)
                dataTransfer[0] = mMap
                dataTransfer[1] = url
                getNearbyPlacesData.execute(*dataTransfer)
                Toast.makeText(context, "Showing Nearby Hospitals", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.btnBanks -> {
                mMap!!.clear()
                val Bank = "bank"
                val url = getUrl(latitude, longitude, Bank)
                dataTransfer[0] = mMap
                dataTransfer[1] = url
                getNearbyPlacesData.execute(*dataTransfer)
                Toast.makeText(context, "Showing Nearby Banks", Toast.LENGTH_SHORT).show()
            }
            R.id.btnRestaurants -> {
                mMap!!.clear()
                val Restaurant = "restuarant"
                val url = getUrl(latitude, longitude, Restaurant)
                dataTransfer[0] = mMap
                dataTransfer[1] = url
                getNearbyPlacesData.execute(*dataTransfer)
                Toast.makeText(context, "Showing Nearby Restaurants", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.btnSchools -> {
                mMap!!.clear()
                val School = "school"
                val url = getUrl(latitude, longitude, School)
                dataTransfer[0] = mMap
                dataTransfer[1] = url
                getNearbyPlacesData.execute(*dataTransfer)
                Toast.makeText(context, "Showing Nearby Schools", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.btnHotels -> {
                mMap!!.clear()
                val Hotel = "hotel"
                val url = getUrl(latitude, longitude, Hotel)
                dataTransfer[0] = mMap
                dataTransfer[1] = url
                getNearbyPlacesData.execute(*dataTransfer)
                Toast.makeText(context, "Showing Nearby Hotels", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun getUrl(latitude: Double, longitude: Double, nearbyPlace: String): String {
        val googlePlaceUrl =
            StringBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?")
        googlePlaceUrl.append("location=$latitude,$longitude")
        googlePlaceUrl.append("&radius=$PROXIMITY_RADIUS")
        googlePlaceUrl.append("&type=$nearbyPlace")
        googlePlaceUrl.append("&key=" + "AIzaSyCxLjuo0Q1lFVSxOI5tF2p-iASL9oDmJUw")
        googlePlaceUrl.append("&sensor=true")

        Log.d("MapsActivity", "url = $googlePlaceUrl")

//        googlePlaceUrl.append("&key=" + "AIzaSyD8vIGjAFZA8HG2b1c4seP_1xQysZxuPYc")

        return googlePlaceUrl.toString()
    }
    private fun getCurrentLocation() {
        // 1
        if (ActivityCompat.checkSelfPermission(requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION) !=
            PackageManager.PERMISSION_GRANTED) {
            // 2
            checkLocationPermission()
        } else {
            // 3
            fusedLocationClient.lastLocation.addOnCompleteListener {
                val location = it.result
                if (location != null) {
                    // 4
                    val latLng = LatLng(location.latitude, location.longitude)
                    // 5
                    mMap?.addMarker(MarkerOptions().position(latLng)
                        .title("You are here!"))
                    // 6
                    val update = CameraUpdateFactory.newLatLngZoom(latLng, 16.0f)
                    // 7
                    mMap?.moveCamera(update)
                } else {
                    // 8
                    Log.e("TAG", "No location found")
                }
            }
        }
    }

    override fun onConnected(@Nullable bundle: Bundle?) {
        locationRequest = LocationRequest.create()
        if (context?.let {
                ContextCompat.checkSelfPermission(
                    it,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            } == PackageManager.PERMISSION_GRANTED
        ) {
            locationRequest?.let { locationRequest ->
                // 1
                locationRequest.priority =
                    LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
                // 2
                locationRequest.interval = 100
                // 3
                locationRequest.fastestInterval = 1000
                // 4
                val locationCallback = object : LocationCallback() {
                    override fun onLocationResult(locationResult: LocationResult?) {
                        getCurrentLocation()
                    }
                }
                // 5
                fusedLocationClient.requestLocationUpdates(locationRequest,
                    locationCallback, null)
            }
        }
    }

    fun checkLocationPermission(): Boolean {
        return if (context?.let {
                ContextCompat.checkSelfPermission(
                    it,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            } != PackageManager.PERMISSION_GRANTED
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    context as Activity,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                    REQUEST_LOCATION_CODE
                )
            } else {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                    REQUEST_LOCATION_CODE
                )
            }
            false
        } else {
            true
        }
    }

    override fun onConnectionSuspended(i: Int) {}
    override fun onConnectionFailed(connectionResult: ConnectionResult) {}
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Int, param2: String) =
            MapsFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}