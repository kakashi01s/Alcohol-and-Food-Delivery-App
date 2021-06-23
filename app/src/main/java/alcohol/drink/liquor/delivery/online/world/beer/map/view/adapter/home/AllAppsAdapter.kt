package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.adapter.home

import android.content.Context
import android.view.ViewGroup
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.R
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.base.adapter.GenericRecyclerAdapter
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.listener.AllAppsItemClickListener
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.viewholder.AllAppsViewHolder

class AllAppsAdapter(context: Context?) :
GenericRecyclerAdapter<List<String>, AllAppsItemClickListener<List<String>>, AllAppsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllAppsViewHolder {
        return AllAppsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}