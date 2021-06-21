package global.tv.channel.live.streaming.free.online.social.food.shopping.view.adapter.home

import android.content.Context
import android.view.ViewGroup
import global.tv.channel.live.streaming.free.online.social.food.shopping.R
import global.tv.channel.live.streaming.free.online.social.food.shopping.base.adapter.GenericRecyclerAdapter
import global.tv.channel.live.streaming.free.online.social.food.shopping.view.listener.AllAppsItemClickListener
import global.tv.channel.live.streaming.free.online.social.food.shopping.view.viewholder.AllAppsViewHolder

class AllAppsAdapter(context: Context?) :
GenericRecyclerAdapter<List<String>, AllAppsItemClickListener<List<String>>, AllAppsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllAppsViewHolder {
        return AllAppsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}