package shopping.grocery.medicine.online.deals.coupons.compare.buy.view.fragment

import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.facebook.ads.*
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import shopping.grocery.medicine.online.deals.coupons.compare.buy.R
import shopping.grocery.medicine.online.deals.coupons.compare.buy.utils.Constants
import shopping.grocery.medicine.online.deals.coupons.compare.buy.view.MainActivity
import shopping.grocery.medicine.online.deals.coupons.compare.buy.view.WebActivity
import shopping.grocery.medicine.online.deals.coupons.compare.buy.view.adapter.DealsAdapter
import shopping.grocery.medicine.online.deals.coupons.compare.buy.view.listener.deals.CouponInfoClickListener
import shopping.grocery.medicine.online.deals.coupons.compare.buy.view.listener.deals.DealClickListener
import shopping.grocery.medicine.online.deals.coupons.compare.buy.viewmodel.DealsViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DealFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DealFragment : Fragment(), CouponInfoClickListener, DealClickListener {
    // TODO: Rename and change types of parameters
    private var param1: Int? = null
    private var param2: String? = null

    var rvInvest: RecyclerView? = null
    var dealsAdapter: DealsAdapter? = null
    var dealsViewModel: DealsViewModel? = null
    var investDataList: ArrayList<List<String>>? = ArrayList()
    var firebaseAnalytics: FirebaseAnalytics? = null

    var firebaseRemoteConfig: FirebaseRemoteConfig? = null
    var btShowDeals: Button? = null
    private var interstitialFbAd: com.facebook.ads.InterstitialAd? = null
    private var adView: AdView? = null
    var layoutShowVideo: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_invest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)

        setRecyclerView()

        dealsViewModel = ViewModelProvider(activity!!).get(DealsViewModel::class.java)
        firebaseRemoteConfig = FirebaseRemoteConfig.getInstance()
        dealsViewModel?.loadData()
        if (firebaseRemoteConfig!!.getBoolean(Constants().SHOW_ADS)) {
            onLoadFbInterstitial()
        }
        dealsViewModel!!.dealsLiveData.observe(this, Observer { t ->
            Log.d("TAG", "onViewCreated: Deals ${t?.size}")
            investDataList?.addAll(t!!)
            dealsAdapter?.notifyDataSetChanged()
        })

        btShowDeals!!.setOnClickListener {
            if(interstitialFbAd!!.isAdLoaded){
                interstitialFbAd!!.show()
            }
            else{
                onDisplayDeals()
            }
        }


    }

    fun initViews(view: View){
        firebaseAnalytics = FirebaseAnalytics.getInstance(activity!!)
        rvInvest = view.findViewById(R.id.rvInvest)
        layoutShowVideo = view.findViewById(R.id.layoutShowVideo)
        btShowDeals = layoutShowVideo!!.findViewById(R.id.btShowDeals)
    }

    fun setRecyclerView(){
        dealsAdapter = DealsAdapter(context, investDataList!!, this, this)
        rvInvest.apply {
            rvInvest?.layoutManager = GridLayoutManager(context, 2)
            rvInvest!!.addItemDecoration(SpacesItemDecoration(20))
            rvInvest?.adapter = dealsAdapter
        }
    }

    private class SpacesItemDecoration(private val space: Int) : ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect, view: View,
            parent: RecyclerView, state: RecyclerView.State
        ) {
            outRect.top = space
            outRect.bottom = space

            // Add top margin only for the first item to avoid double space between items
            if (parent.getChildLayoutPosition(view) % 2 == 0) {
                outRect.left = space
                outRect.right = space
            } else {
                outRect.left = space
                outRect.right = 0
            }
        }
    }
    fun onLoadFbInterstitial() {
        interstitialFbAd = InterstitialAd(context, Constants().getFbInterstitialWebExit())

        val interstitialAdListener: InterstitialAdListener = object : InterstitialAdListener {
            override fun onInterstitialDisplayed(ad: Ad) {
                // Interstitial ad displayed callback
                Log.e(TAG, "Interstitial ad displayed.")
            }

            override fun onInterstitialDismissed(ad: Ad) {
                // Interstitial dismissed callback
                Log.e(TAG, "Interstitial ad dismissed.")

            }

            override fun onError(ad: Ad?, adError: AdError) {
                // Ad error callback
                Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage())
            }

            override fun onAdLoaded(ad: Ad) {
                // Interstitial ad is loaded and ready to be displayed
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!")
                // Show the ad
//                interstitialFbAd.show()
            }

            override fun onAdClicked(ad: Ad) {
                // Ad clicked callback
                Log.d(TAG, "Interstitial ad clicked!")
            }

            override fun onLoggingImpression(ad: Ad) {
                // Ad impression logged callback
                Log.d(TAG, "Interstitial ad impression logged!")
            }
        }

        interstitialFbAd!!.loadAd(
            interstitialFbAd!!.buildLoadAdConfig()
                .withAdListener(interstitialAdListener)
                .build()
        );

    }

    fun onDisplayDeals(){
        if(layoutShowVideo!!.visibility == View.VISIBLE){
            layoutShowVideo!!.visibility = View.GONE
        }
        if(rvInvest!!.visibility == View.GONE){
            rvInvest!!.visibility = View.VISIBLE
        }
    }


    override fun onDestroy() {
        dealsViewModel?.reset()
        super.onDestroy()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment InvestFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Int, param2: String) =
            DealFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onClickDeal(item: List<String>) {

        val bundle = Bundle()
        bundle.putString("title", item.get(1))
        bundle.putString("url", item.get(3))
        (activity as MainActivity?)!!.onUpdateLogEvent(bundle, "deals_visited", true)

        val intent: Intent? = Intent(activity, WebActivity::class.java)
        intent?.putExtra("title", item.get(1))
        intent?.putExtra("url", item.get(3))
        intent?.putExtra("app_icon", item.get(2))
        startActivity(intent)
    }

    override fun onClickCoupon(item: List<String>) {

        val bundle = Bundle()
        bundle.putString("title", item.get(1))
        bundle.putString("url", item.get(4))
        (activity as MainActivity?)!!.onUpdateLogEvent(bundle, "coupons_visited", true)

        val intent: Intent? = Intent(activity, WebActivity::class.java)
        intent?.putExtra("title", item.get(1))
        intent?.putExtra("url", item.get(4))
        intent?.putExtra("app_icon", item.get(2))
        startActivity(intent)
    }

}