package alcohol.drink.liquor.delivery.online.world.beer.map.view.listener.category


import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.listener.BaseRecyclerListener

interface MostUsefulAppsItemClickListener <T> : BaseRecyclerListener {
    fun onMostUsefulAppsCardClick(item: T)
}