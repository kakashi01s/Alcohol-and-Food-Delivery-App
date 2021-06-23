package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.listener.home

import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.listener.BaseRecyclerListener

interface TrendingItemClickListener <T> : BaseRecyclerListener {
    fun onTrendingClickListener(item: T)
}