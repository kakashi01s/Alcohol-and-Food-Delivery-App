package global.tv.channel.live.streaming.free.online.social.food.shopping.view.adapter.home

import android.content.Context
import android.view.ViewGroup
import global.tv.channel.live.streaming.free.online.social.food.shopping.R
import global.tv.channel.live.streaming.free.online.social.food.shopping.base.adapter.GenericRecyclerAdapter
import global.tv.channel.live.streaming.free.online.social.food.shopping.view.listener.home.TrendingItemClickListener
import global.tv.channel.live.streaming.free.online.social.food.shopping.view.viewholder.TrendingViewHolder

class TrendingAdapter (context: Context?) :
    GenericRecyclerAdapter<List<String>, TrendingItemClickListener<List<String>>, TrendingViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingViewHolder {
        return TrendingViewHolder(inflate(R.layout.card_trending_layout,parent))
    }
}