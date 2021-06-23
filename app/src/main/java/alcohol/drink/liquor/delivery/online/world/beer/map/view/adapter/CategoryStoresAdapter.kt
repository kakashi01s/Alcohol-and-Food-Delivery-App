package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.adapter

import android.content.Context
import android.view.ViewGroup
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.R
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.adapter.GenericRecyclerAdapter
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.listener.CategoryStoresItemClickListener
import alcohol.drink.liquor.delivery.online.world.beer.guide.map.map.view.viewholder.CategoryStoresViewHolder

class CategoryStoresAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, CategoryStoresItemClickListener<List<String>>, CategoryStoresViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryStoresViewHolder {
        return CategoryStoresViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}