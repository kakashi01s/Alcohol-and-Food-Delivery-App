package global.tv.channel.live.streaming.free.online.map.view.listener.category


import global.tv.channel.live.streaming.free.online.social.food.shopping.base.listener.BaseRecyclerListener

interface MostUsefulAppsItemClickListener <T> : BaseRecyclerListener {
    fun onMostUsefulAppsCardClick(item: T)
}