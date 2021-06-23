package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.viewpager

import alcohol.drink.liquor.delivery.online.world.beer.map.view.fragment.MapsFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.fragment.BookmarkFragment
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.fragment.CategoryFragment
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.fragment.DealFragment
import alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.view.fragment.FragmentHome

class AppPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    val NUM_ITEMS = 4;

    override fun getCount(): Int {
        return NUM_ITEMS
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentHome.newInstance(position, "Home")
            }
            1 -> {
                CategoryFragment.newInstance(position, "Category")
            }
            2 -> {
                MapsFragment.newInstance(position, "Deals")
            }
            3 -> {
                BookmarkFragment.newInstance(position, "Bookmark")
            }

            else -> FragmentHome.newInstance(position, "Home")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null;
        if (position == 0) {
            title = "Home"
        } else if (position == 1) {
            title = "Category"
        } else if (position == 2) {
            title = "Deals"
        }
        return title
    }
}