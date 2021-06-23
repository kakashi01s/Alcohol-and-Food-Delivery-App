package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.adapter

import android.content.Context
import android.view.ViewGroup
import alcohol.drink.liquor.delivery.online.world.beer.map.view.listener.category.CountryItemClickListener
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.R
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.adapter.GenericRecyclerAdapter
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.viewholder.GlobalViewHolder

class CountryStoresAdapter(context: Context?) : GenericRecyclerAdapter<List<String>, CountryItemClickListener<List<String>>,GlobalViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GlobalViewHolder {
        return GlobalViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}