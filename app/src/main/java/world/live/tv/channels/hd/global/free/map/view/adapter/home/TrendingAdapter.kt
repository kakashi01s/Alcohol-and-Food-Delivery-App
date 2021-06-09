package world.live.tv.channels.hd.global.free.online.guide.map.view.adapter.home

import android.content.Context
import android.view.ViewGroup
import world.live.tv.channels.hd.global.free.online.guide.map.R
import world.live.tv.channels.hd.global.free.online.guide.map.base.adapter.GenericRecyclerAdapter
import world.live.tv.channels.hd.global.free.online.guide.map.view.listener.home.TrendingItemClickListener
import world.live.tv.channels.hd.global.free.online.guide.map.view.viewholder.TrendingViewHolder

class TrendingAdapter (context: Context?) :
    GenericRecyclerAdapter<List<String>, TrendingItemClickListener<List<String>>, TrendingViewHolder>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingViewHolder {
        return TrendingViewHolder(inflate(R.layout.card_trending_layout,parent))
    }
}