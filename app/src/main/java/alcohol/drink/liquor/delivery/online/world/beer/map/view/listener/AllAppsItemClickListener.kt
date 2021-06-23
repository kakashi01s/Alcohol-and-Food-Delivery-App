package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.listener

import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.listener.BaseRecyclerListener

interface AllAppsItemClickListener<T> : BaseRecyclerListener {
    fun onAllCardClick(item: T)
}