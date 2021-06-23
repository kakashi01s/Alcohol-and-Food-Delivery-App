package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.data

import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.model.AllAppsModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface DataService {
    @GET
    fun fetchAllApps(@Url url: String, @Query("key") key: String): Observable<AllAppsModel>

}