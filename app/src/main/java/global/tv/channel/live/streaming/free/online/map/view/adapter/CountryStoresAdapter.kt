package global.tv.channel.live.streaming.free.online.social.food.shopping.view.adapter

import android.content.Context
import android.view.ViewGroup
import global.tv.channel.live.streaming.free.online.map.view.listener.category.CountryItemClickListener
import global.tv.channel.live.streaming.free.online.social.food.shopping.R
import global.tv.channel.live.streaming.free.online.social.food.shopping.base.adapter.GenericRecyclerAdapter
import global.tv.channel.live.streaming.free.online.social.food.shopping.view.viewholder.GlobalViewHolder

class CountryStoresAdapter(context: Context?) : GenericRecyclerAdapter<List<String>, CountryItemClickListener<List<String>>,GlobalViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GlobalViewHolder {
        return GlobalViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}