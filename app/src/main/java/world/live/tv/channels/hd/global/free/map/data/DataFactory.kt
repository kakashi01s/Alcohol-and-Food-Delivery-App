package world.live.tv.channels.hd.global.free.online.guide.map.data

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DataFactory {


    val URL_ALL_APPS = BASE_URL + "1ct-vYLuOlMd4sUpecFW6-Bg75gPiSJ7pR_l90GaO1FM/values/Sheet1!A2:E/"
    val URL_CAROUSEL_IMAGES = BASE_URL + "1tZG0Z-E8AmJm1M5mAh7TR5eAA5QLKMNvUXBYopGmyZw/values/Sheet1!A2:E/"
    val URL_TOP_INTERNATIONAL = BASE_URL + "1x26LGgz5XEYQbBWGmbzyLIFhZEBvSlHLeSQW8kIaCfU/values/Sheet1!A2:E/"
    val URL_INDIA = BASE_URL + "1Qzz66uLh0SgN5bgOVOOujeHR2hwp70mEChpcpZ02-u4/values/Sheet1!A2:E/"
    val URL_USA = BASE_URL + "1eSzMHeBNFGzejZa6ZWik8okXh18du7VNFhFNs8E-iQE/values/Sheet1!A2:E/"
    val URL_RUSSIA = BASE_URL + "1vg1IdR7Pm3faWNbtsPFedeqWUTOx2-i-dI0WjExoPb4/values/Sheet1!A2:E/"
    val URL_PAKISTAN = BASE_URL + "1PgVQJa3bXA4SkTn2I-rUgYgY838oqr6WRpkWDkCNBOc/values/Sheet1!A2:E/"
    val URL_CHINA = BASE_URL + "14dd_QuEb6EnvFbzNSsQVFNJP9lf86otzJYmqZCrGOJE/values/Sheet1!A2:E/"
    val URL_GERMANY = BASE_URL + "1w9RsBSk2eCXWrRQBJyUGTne9US9CDqljXwtlTYDlTzU/values/Sheet1!A2:E/"
    val URL_TURKEY = BASE_URL + "19YP9gRCRrOSONoOhKvVaCX0_NU8JYEhh9Tf7uwuQCrY/values/Sheet1!A2:E/"
    val URL_UAE = BASE_URL + "1FD307Pj8_AwuAo0jiLIlLgRWU_qw5Claw1WIwYpDhFI/values/Sheet1!A2:E/"
    val URL_ITALY = BASE_URL + "1icROXjlDRRJzKs0RDDN2ynpIXYy30bDqFsAU8PsUd-4/values/Sheet1!A2:E/"
    val URL_SWITZERLAND = BASE_URL + "1big-DGl8akYyPVnta2geu71dzOCZAYIELtdaTbqURQ4/values/Sheet1!A2:E/"
    val URL_CANADA = BASE_URL + "12hi5mu88JtX9Eqkz51RctvzhqbGOz1Ddg5JvRltBfQo/values/Sheet1!A2:E/"
    val URL_SINGAPORE = BASE_URL + "1nmyHhc8oLiqV9y5T5H8nQH9h2SqZQc0B73xhUhZRg7c/values/Sheet1!A2:E/"
    val URL_SOUTH_AFRICA = BASE_URL + "16VQo4QaWBJnEdHmrToy1f4cl-fporcLufd3-FNnpOTg/values/Sheet1!A2:E/"
    val URL_FRANCE = BASE_URL + "1ohFYSphdL-DVbTdhFuaqViDwqIVKVsRARtU8M3m4vM0/values/Sheet1!A2:E/"
    val URL_INDONECIA = BASE_URL + "1Y2O5X54s4mjnj8mrs5M6NGEkuY46moO7Qh_Lp6aWHNY/values/Sheet1!A2:E/"
    val URL_UK = BASE_URL + "1vB-JIQG0H91nHjl7G8WvXkuKmumof1zIEwbO9d1V7eM/values/Sheet1!A2:E/"
    val URL_JAPAN = BASE_URL + "1B0wGtPHQfmDGHLCS0Bf2okN6wNTPgYuIg-MEzeeLn4k/values/Sheet1!A2:E/"
    val URL_BRAZIL = BASE_URL + "1y8HM2xmqifSgtP3ZYDzJPJNvIuQ9ApJpoLzVy3UVAnI/values/Sheet1!A2:E/"
    val URL_NIGERIA = BASE_URL + "1BG9_HWRYJ7gI0T4uf34nUgLOdiWemCh5geVGG-fy2Yg/values/Sheet1!A2:E/"
    val URL_PORTUGAL = BASE_URL + "1FYi8x_bzUod9lqMD4YllcytNUMK14r3f2Y6p_7xPWFU/values/Sheet1!A2:E/"
    val URL_AUSTRALIA = BASE_URL + "1T-Ui9ReaAehnrSeRL_roL-3ueo2U49CPVRFFb16KTbg/values/Sheet1!A2:E/"
    val URL_GREECE = BASE_URL + "1mNi0qIf7J87pgl1d5fL4QEWaIE6jwBRqy8O9Qzv620U/values/Sheet1!A2:E/"
    val URL_CYPURS = BASE_URL + "1Lipgh92-HYqYledf9yeY7IYpO4O9yR3RgCttVN1DKVs/values/Sheet1!A2:E/"
    val URL_BELGIUM = BASE_URL + "1YLXw0mE58RjTNMceo3CcGwZ92g1ICBHNRg51-mICED4/values/Sheet1!A2:E/"
    val URL_MEXICO = BASE_URL + "1R4BcIp6bUTrIdt5iOUYHVFe7vVHefhoUMpccbSjklEA/values/Sheet1!A2:E/"
    val URL_SOUTH_KOREA = BASE_URL + "1T7ZRi_MSpY87YALFfxE92Gpi_lE1vNrkZtxpTPhhUlg/values/Sheet1!A2:E/"
    val URL_PHILIPPINES = BASE_URL + "1v1wGt4ncv670r5j4XdBWUQ0PrmuP12OdnE-ThF0mbY0/values/Sheet1!A2:E/"
    val URL_ARGENTINA = BASE_URL + "1kZ57GYkOw9su107qPk1udbGEmZ8w_Q_pt7UTa_hi77Y/values/Sheet1!A2:E/"
    val URL_HONG_KONG = BASE_URL + "1W562GnTv-xupxLMEA9yzOmRqEirwFRmuThCTGsxUOEY/values/Sheet1!A2:E/"
    val URL_SAUDI_ARABIA = BASE_URL + "1_AHwTboR2AfKYUdfiuo0e4nnwaCi4iUCi2m5SfDK2d8/values/Sheet1!A2:E/"
    val URL_KENYA = BASE_URL + "1ERbO4w4y9nLOnJXI5kT6NkNprkpP-C-52JTExfpsVSQ/values/Sheet1!A2:E/"
    val URL_DENMARK = BASE_URL + "1xAMezzRxJpy8_9RDJEunSOer0d4jQRhzwbg3S-wABCc/values/Sheet1!A2:E/"

    val URL_RENT_ALL_APPS = BASE_URL + "116jsqQvvC7uI1nIY5aEwTqomC7FNtpuU-lonximWNTk/values/Sheet1!A2:E/"
    val URL_RENT_CAROUSEL_IMAGES = BASE_URL + "1y4DpcPUUieSCPEhZU8PYNhBZBjKQnNoO5qRtfs6mV68/values/Sheet1!A2:E/"
    val URL_RENT_EXPLORER_IMAGES = BASE_URL + "12rmpFWFMNdIhxHVwfko4l-rc9NnkQOU3FQL3R_UtEkc/values/Sheet1!A2:E/"

    val URL_NEWS = BASE_URL + "1EXRh07IGeiXOG1JUWtemGp6xtCXnwVEQrSFhesiX0kw/values/Sheet1!A2:E/"
    val URL_STOCK = BASE_URL + "1RG5gjNxHgaex0jBzneylojV94_2Nx25Qozy9zF9u5IA/values/Sheet1!A2:E/"
    val URL_CURRENCY = BASE_URL + "1yeQwlsfcc_3hgLEEULbD7IK4FtCWfFwbDxjao8-xGQo/values/Sheet1!A2:E/"
    val URL_CRYPTOCURRENCY = BASE_URL + "1KpGkUw7JXDMuYg3KsS6sQhm3AZ1vuIUlDM3-UPpUcuU/values/Sheet1!A2:E/"
    val URL_WEATHER_NEWS = BASE_URL + "1fB3Yy3i6izQybhHJhbZdZsFKnIi7KS4MqAVdHrxLCc8/values/Sheet1!A2:E/"
    val URL_WORLD_TOUR = BASE_URL + "1fB3Yy3i6izQybhHJhbZdZsFKnIi7KS4MqAVdHrxLCc8/values/Sheet1!A2:E/"
    val URL_LIVE_NEWS_CHANNELS = BASE_URL + "1moZsfGxYoBJrzSI4FLGSzlCgTo8Uiufmp4ppHt3CHgY/values/Sheet1!A2:E/"
    val URL_MOST_USEFUL_APPS = BASE_URL + "1BlpRHcgtOQJ-0w_qLyS4n9XXssV4sAjz2uM1WvdUdBg/values/Sheet1!A2:E/"

    val KEY = "AIzaSyCANMG2wzSKUeM8AbqQ14Zj48VK5-cBQzI"



//    val URL_ALL_APPS = BASE_URL + "13Xg13-BQ1yQea2g5C95xtHqQkWKRkHfX4PvjaEYqn8I/values/Sheet1!A2:F/"
//    val URL_CAROUSEL_IMAGES = BASE_URL + "1P91BnfdAOvsLh9QgYQVo5WAMPS-df9U1vKCuuc0TbDQ/values/Sheet1!A2:E/"
    val URL_TRENDING_DATA = BASE_URL + "1ToBlwN9pm4JPPS-e2KKJSRVbadDRBWMOOLzwV9udjuo/values/Sheet1!A2:E/"
    val URL_DEALS_DATA = BASE_URL + "1UG9ZrSR-lEuTgV1zb0yM2pYEdrucTzERXoMBYgxql1E/values/Sheet1!A2:F/"
//    val URL_SUPER_MART = BASE_URL + "1SbahrVVK5vLlbtOmXVaAQ-Wu1XGBgnKm7Jba3hVtCQQ/values/Sheet1!A2:E/"
//    val URL_GROCERIES = BASE_URL + "185LuxhBUdcLoYeLW-ccvJqLbmGJvMuD9w6cWBcB2zmc/values/Sheet1!A2:E/"
//    val URL_MEDICINES = BASE_URL + "1xbD4KUC7w2RGI7NAt0bHqK0dcBGaHEUe0BFYQ1MGGEM/values/Sheet1!A2:E/"
//    val URL_SUPPLEMENTS = BASE_URL + "1EnsB2WMUckve7ZDJoJXz2jf94YhZ2zgdwJ_Z-jRxBls/values/Sheet1!A2:E/"
//    val URL_ELECTRONICS = BASE_URL + "1sOUNYrEpueSvHjNePepso6g82LBXiZOTvYgIaEe6VRQ/values/Sheet1!A2:E/"
//    val URL_BEAUTY = BASE_URL + "1pL9ykk83M5SaoW3E5i6__fvUGEu5l5hA8AM_IvUpwiw/values/Sheet1!A2:E/"
//    val URL_JEWELLERY = BASE_URL + "1gp-XjaR8N6rEppQ94eigyZldOqLP1NwOHlG-W8HsEls/values/Sheet1!A2:E/"
//    val URL_KITCHEN_APPLIANCES = BASE_URL + "1phfZA0KytaN0xlBlxCC4EGtUFk-oUwrcZLwv-v0V6yw/values/Sheet1!A2:E/"
//    val URL_KIDS_LIFESTYLE = BASE_URL + "1IstfLiD74mnX7tmhX_SN86rdtmGqgVui-RLaaa-RK_s/values/Sheet1!A2:E/"
//    val URL_BABY_TOYS = BASE_URL + "1fQTSMqtZm-kZSH2J2phaLcvVhKa7zNA--H9P-gRCiTo/values/Sheet1!A2:E/"
//    val URL_LINGERIE = BASE_URL + "1Q0JBQZrHGXu3qweHagaZUoqObxedRb62PlRZ7VOl84A/values/Sheet1!A2:E/"
//    val URL_MEN_INNER_WEAR = BASE_URL + "16J4Y9iQYUwTRC9WfKRpSnBHVfRce7EryAAxMWI8nN9Y/values/Sheet1!A2:E/"
//    val URL_BOOKS = BASE_URL + "1Z8SBvM18gKSL-3Qi1Q38P3ZiR5IlbES1rhx2-7mDp7k/values/Sheet1!A2:E/"
//    val URL_FOOTWEAR = BASE_URL + "1LT8o9_K99NwenzLfDESJApP90KMrfX1bQpym4oq8Ebo/values/Sheet1!A2:E/"
//    val URL_INDIA= BASE_URL+"1Sw9TRb-QXYRiVr0mLqEQgt2e4jlMvkAaGBvy6Dws9dQ/values/Sheet1!A2:E/"
//    val URL_RUSSIA= BASE_URL+"1JIh5rHlijJRidBoQXOay-KPwS2m4YckhxN2qB6SQh94/values/Sheet1!A2:E/"
//    val URL_PAKISTAN= BASE_URL+"1pjuaQ6cDQt1KCZVylzckhPdkrJ3tJkx7RPWehis81zg/values/Sheet1!A2:E/"
//    val URL_CHINA= BASE_URL+"14wmPXXCU2oRyPNp4kJUnAuo6J4ziVs2pRYGeHmq0eHg/values/Sheet1!A2:E/"
//    val URL_GERMANY= BASE_URL+"1iqYV2HGVdUEzXWO2O72BtbOv7FSo0O27yqi9f-CGVOg/values/Sheet1!A2:E/"
//    val URL_TURKEY= BASE_URL+"1e7Vis671g_udhfh1-RoQ-_VlmQIUHE-WV7lS5NRhgks/values/Sheet1!A2:E/"
//    val URL_UAE= BASE_URL+"1JzTpUJbw16mylSIeLC2iZStgUAOCogPYK6boM9AZEdk/values/Sheet1!A2:E/"
//    val URL_USA= BASE_URL+"1lptekCtOr2_F09OjjZ6yc8iteyqm50q5l7905JjKonc/values/Sheet1!A2:E/"
//    val URL_ITALY= BASE_URL+"1ibrq8ZLD_nLGfSgVv_EGN7tsSLieRRgX4aq6BrjjaQo/values/Sheet1!A2:E/"
//    val URL_SWITZERLAND= BASE_URL+"1GLjen72To70fdMmCWWe2wehh4xwWTgnDPydy9fN6MIs/values/Sheet1!A2:E/"
//    val URL_CANADA= BASE_URL+"1MD5Yn5BYXltYNxXLTxeIwx01NDlH0MeCknanXxcYhRY/values/Sheet1!A2:E/"
//    val URL_SINGAPORE= BASE_URL+"1HeBWrMcEFbko_gLGRLTqAce4cBHmT6fxS2enLttfOkM/values/Sheet1!A2:E/"
//    val URL_SOUTH_AFRICA= BASE_URL+"1O2gH9Q5RgIpAr_UG0tSaCBuY7lBwRMcGMIvbhcSqesk/values/Sheet1!A2:E/"
//    val URL_FRANCE= BASE_URL+"1pKvUmWEl4xHVv2PK7S44YA70gTo3CKPaTF84xkXivos/values/Sheet1!A2:E/"
//    val URL_INDONESIA= BASE_URL+"1-wAMeMNT3tMBwV_y-ZKysE0dsG99eeVAy9cB-6UG66Y/values/Sheet1!A2:E/"
//    val URL_UK= BASE_URL+"1WhRv_Dx582FLu_9Mm_pkUpfTEJsggCMXbhdyH74OZO4/values/Sheet1!A2:E/"
//    val URL_JAPAN= BASE_URL+"1PqPSVjmHSjkrEkRBKDs8SowQsxebfndlYaOy9gwhlak/values/Sheet1!A2:E/"
//    val URL_BRAZIL= BASE_URL+"1cQAglnc1aKTfDWT2y2Z286sZnsFcz0n3jzT33qSbPJU/values/Sheet1!A2:E/"
//    val URL_NIGERIA= BASE_URL+"1TUx4R3ESLQl7crqJqEoE5nYNXfrJQSpc2WNk_O73O6k/values/Sheet1!A2:E/"
//    val URL_PORTUGUL= BASE_URL+"1Fx8_LoMLTghKA-G-cwMy-kq4OIhse6xuoJ7vm59Zu_w/values/Sheet1!A2:E/"
//    val URL_AUSTRALIA= BASE_URL+"1FHMyGV1nI-uKP6-_8Kcdfncyasgwi1NPBwQEc8RQQCQ/values/Sheet1!A2:E/"
//    val URL_GREECE= BASE_URL+"1bCKNpvhI9OXA55RRioMRvqYbmX2vgdqhD19bh3gV2Tw/values/Sheet1!A2:E/"
//    val KEY = "AIzaSyDdX1pz2bBXYlZFHqlAWUI83v0_j2xOuFg"

    companion object{
        private val BASE_URL = "https://sheets.googleapis.com/v4/spreadsheets/"

        fun create(): DataService? {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(DataService::class.java)
        }
    }
}