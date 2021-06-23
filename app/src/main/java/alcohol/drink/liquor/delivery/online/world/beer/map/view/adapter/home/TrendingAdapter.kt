package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.adapter.home

import android.content.Context
import android.view.ViewGroup
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.R
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.adapter.GenericRecyclerAdapter
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.listener.home.TrendingItemClickListener
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.viewholder.TrendingViewHolder

class TrendingAdapter (context: Context?) :
    GenericRecyclerAdapter<List<String>, TrendingItemClickListener<List<String>>, TrendingViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingViewHolder {
        return TrendingViewHolder(inflate(R.layout.card_trending_layout,parent))
    }
}