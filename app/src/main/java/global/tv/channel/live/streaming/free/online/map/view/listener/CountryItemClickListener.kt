package global.tv.channel.live.streaming.free.online.map.view.listener

import global.tv.channel.live.streaming.free.online.social.food.shopping.base.listener.BaseRecyclerListener

interface CountryItemClickListener<T> : BaseRecyclerListener {
    fun CategoryStoresCardClick(item: T)
}