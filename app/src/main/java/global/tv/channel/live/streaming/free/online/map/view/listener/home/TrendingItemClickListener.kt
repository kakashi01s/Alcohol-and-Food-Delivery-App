package global.tv.channel.live.streaming.free.online.social.food.shopping.view.listener.home

import global.tv.channel.live.streaming.free.online.social.food.shopping.base.listener.BaseRecyclerListener

interface TrendingItemClickListener <T> : BaseRecyclerListener {
    fun onTrendingClickListener(item: T)
}