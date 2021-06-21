package global.tv.channel.live.streaming.free.online.social.food.shopping.view.adapter

import android.content.Context
import android.view.ViewGroup
import global.tv.channel.live.streaming.free.online.social.food.shopping.R
import global.tv.channel.live.streaming.free.online.social.food.shopping.base.adapter.GenericRecyclerAdapter
import global.tv.channel.live.streaming.free.online.social.food.shopping.view.listener.CategoryStoresItemClickListener
import global.tv.channel.live.streaming.free.online.guide.map.map.view.viewholder.CategoryStoresViewHolder

class CategoryStoresAdapter(context: Context?) :
    GenericRecyclerAdapter<List<String>, CategoryStoresItemClickListener<List<String>>, CategoryStoresViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryStoresViewHolder {
        return CategoryStoresViewHolder(inflate(R.layout.card_all_apps_portal_layout,parent))
    }
}