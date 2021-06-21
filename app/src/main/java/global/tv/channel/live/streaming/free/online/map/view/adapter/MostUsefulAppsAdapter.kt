package global.tv.channel.live.streaming.free.online.map.view.adapter

import android.content.Context
import android.view.ViewGroup
import global.tv.channel.live.streaming.free.online.map.view.listener.category.MostUsefulAppsItemClickListener
import global.tv.channel.live.streaming.free.online.map.view.viewholder.MostUsefulAppsViewHolder
import global.tv.channel.live.streaming.free.online.social.food.shopping.R
import global.tv.channel.live.streaming.free.online.social.food.shopping.base.adapter.GenericRecyclerAdapter

class MostUsefulAppsAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, MostUsefulAppsItemClickListener<List<String>>, MostUsefulAppsViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MostUsefulAppsViewHolder{
        return MostUsefulAppsViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}