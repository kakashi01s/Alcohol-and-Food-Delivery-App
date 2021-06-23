package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.listener

import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.listener.BaseRecyclerListener

interface CategoryStoresItemClickListener<T> : BaseRecyclerListener {
    fun CategoryStoresCardClick(item: T)
}