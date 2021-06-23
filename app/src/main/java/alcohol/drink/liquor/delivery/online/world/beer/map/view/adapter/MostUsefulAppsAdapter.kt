package alcohol.drink.liquor.delivery.online.world.beer.map.view.adapter

import android.content.Context
import android.view.ViewGroup
import alcohol.drink.liquor.delivery.online.world.beer.map.view.listener.category.MostUsefulAppsItemClickListener
import alcohol.drink.liquor.delivery.online.world.beer.map.view.viewholder.MostUsefulAppsViewHolder
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.R
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.adapter.GenericRecyclerAdapter

class MostUsefulAppsAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, MostUsefulAppsItemClickListener<List<String>>, MostUsefulAppsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MostUsefulAppsViewHolder{
        return MostUsefulAppsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}