package global.tv.channel.live.streaming.free.online.social.food.shopping.view.listener

import global.tv.channel.live.streaming.free.online.social.food.shopping.base.listener.BaseRecyclerListener

interface CategoryStoresItemClickListener<T> : BaseRecyclerListener {
    fun CategoryStoresCardClick(item: T)
}