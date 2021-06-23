package alcohol.drink.liquor.delivery.online.world.beer.wine.whisky.rum.data

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DataFactory {


    //val URL_RENT_ALL_APPS = BASE_URL + "116jsqQvvC7uI1nIY5aEwTqomC7FNtpuU-lonximWNTk/values/Sheet1!A2:F/"
    val URL_RENT_ALL_APPS = BASE_URL + "14g4BN3KoIv4UP5qvwkeMpoEW7uUJbIBbsrn3Hf73aMQ/values/Sheet1!A2:F/"
    val URL_RENT_CAROUSEL_IMAGES = BASE_URL + "1y4DpcPUUieSCPEhZU8PYNhBZBjKQnNoO5qRtfs6mV68/values/Sheet1!A2:E/"
    val URL_RENT_EXPLORER_IMAGES = BASE_URL + "12rmpFWFMNdIhxHVwfko4l-rc9NnkQOU3FQL3R_UtEkc/values/Sheet1!A2:E/"

    val URL_NEWS = BASE_URL + "1EXRh07IGeiXOG1JUWtemGp6xtCXnwVEQrSFhesiX0kw/values/Sheet1!A2:E/"
    val URL_STOCK = BASE_URL + "1RG5gjNxHgaex0jBzneylojV94_2Nx2 5Qozy9zF9u5IA/values/Sheet1!A2:E/"
    val URL_CURRENCY = BASE_URL + "1yeQwlsfcc_3hgLEEULbD7IK4FtCWfFwbDxjao8-xGQo/values/Sheet1!A2:E/"
    val URL_CRYPTOCURRENCY = BASE_URL + "1KpGkUw7JXDMuYg3KsS6sQhm3AZ1vuIUlDM3-UPpUcuU/values/Sheet1!A2:E/"
    val URL_WEATHER_NEWS = BASE_URL + "1fB3Yy3i6izQybhHJhbZdZsFKnIi7KS4MqAVdHrxLCc8/values/Sheet1!A2:E/"
    val URL_WORLD_TOUR = BASE_URL + "1fB3Yy3i6izQybhHJhbZdZsFKnIi7KS4MqAVdHrxLCc8/values/Sheet1!A2:E/"
    val URL_LIVE_NEWS_CHANNELS = BASE_URL + "1moZsfGxYoBJrzSI4FLGSzlCgTo8Uiufmp4ppHt3CHgY/values/Sheet1!A2:E/"
    val URL_MOST_USEFUL_APPS = BASE_URL + "1BlpRHcgtOQJ-0w_qLyS4n9XXssV4sAjz2uM1WvdUdBg/values/Sheet1!A2:E/"

    //global
    val URL_INDIA= BASE_URL+"1mTWC56RC3kQRfuv5lPV7CcpOtR8opfMazYv_RC85TD0/values/Sheet1!A2:E/"
    val URL_RUSSIA= BASE_URL+"15_PgFZM2aMSwoCapRpWqclU-yK6BQcD71eQpj91xDeg/values/Sheet1!A2:E/"
    val URL_PAKISTAN= BASE_URL+"1R0gz5t_0XqyKKTg9BlTSxMR_EJaN8x5DEUpI0Ur5Dys/values/Sheet1!A2:E/"
    val URL_CHINA= BASE_URL+"12tjzzahLsKsEGUyksGeQ0Cxqv2TEuiXg5MTGNf-G_E4/values/Sheet1!A2:E/"
    val URL_GERMANY= BASE_URL+"1oSwH3JKaiMypsbFOqXNwET77Vjgl3gTFxGsy2sehgOY/values/Sheet1!A2:E/"
    val URL_TURKEY= BASE_URL+"1Egw_ql99LxWCewRI0WGEW-8XBJwmMmPpnlaVXmT0DBE/values/Sheet1!A2:E/"
    val URL_UAE= BASE_URL+"11GjH8-5H8edSBd_fqdOGtHbWBB0LDtBZ2QDXpX5GgKM/values/Sheet1!A2:E/"
    val URL_USA= BASE_URL+"10JFvoI4NckUSiP_9xOJj9TDOaH7Mjizha6_ICbcdrjk/values/Sheet1!A2:E/"
    val URL_ITALY= BASE_URL+"1mUTsLl2CEyoxRIvyBIXWaoA8Ox_qliSaK6W3oO-mp2A/values/Sheet1!A2:E/"
    val URL_SWITZERLAND= BASE_URL+"1RiWFP15jcbGNwOQwbfZ-VpBJ0XtdEcuMYwnP-xODaP4/values/Sheet1!A2:E/"
    val URL_CANADA= BASE_URL+"10KIE_bo5NX7UFu2lk64uhQS8JL_K8ARb3s-CrzKcL8I/values/Sheet1!A2:E/"
    val URL_SINGAPORE= BASE_URL+"1yRoUpJaTM4Qb-58pABZ8bHnHdFXTLpQkTWCBaGuPiE0/values/Sheet1!A2:E/"
    val URL_SOUTH_AFRICA= BASE_URL+"1N7nonxgywQT-CmPksGyUK-ShBUrj1VV0CYo_PbFPuT4/values/Sheet1!A2:E/"
    val URL_FRANCE= BASE_URL+"1XKRrhgPIfXUsFTu-mxF4xfmhpEwZuJjRlrC13jhNLE4/values/Sheet1!A2:E/"
    val URL_INDONESIA= BASE_URL+"1bVEc99KYi-oF7Cuv8EJRMXltgtcwon9eCh-8401s1IA/values/Sheet1!A2:E/"
    val URL_UK= BASE_URL+"1ccOkghkyyOsRZxZ_ULc0cejjIA8cRnnTd0gEgvs3ums/values/Sheet1!A2:E/"
    val URL_JAPAN= BASE_URL+"1pBipNHCoZZjy2ufDa4bp2UlWnjd_dbPI5gG_Mkn-puc/values/Sheet1!A2:E/"
    val URL_BRAZIL= BASE_URL+"1Uxok-dLvI5faabVslUZuKznM2o--82rtLFC1jr5hfuI/values/Sheet1!A2:E/"
    val URL_NIGERIA= BASE_URL+"1yG2X3MlXLnpEMQwB9ZvPKkQ9a5EOcUAP17JTIx36fWg/values/Sheet1!A2:E/"
    val URL_PORTUGUL= BASE_URL+"1r70YhU0_rUGv-LdpWjGRxsIxGLm-g1caisLdyeIPOWk/values/Sheet1!A2:E/"
    val URL_AUSTRALIA= BASE_URL+"1usjh_qsRJXoLVj1jAkCd3n_HeNglxx2BdqpYT7IIuJk/values/Sheet1!A2:E/"
    val URL_GREECE= BASE_URL+"1taeDazNx6JGMRJuQUU3Lw4FvIQFz_ct4dVtXkbJo4No/values/Sheet1!A2:E/"

    val URL_BOOKS = BASE_URL + "1eKhFgcPxgB9CH7F8KcLkw9qh1j6gZFbPtsBJ24o-OGU/values/Sheet1!A2:E/"
    val URL_FOOTWEAR = BASE_URL + "1E6LB0BUbQSmyqlPXiVepHXPupHCrnFSgye2KPcRpD7E/values/Sheet1!A2:E/"
    val URL_SUPER_MART = BASE_URL + "1k8575Pw2hulyuS2gBy13i3pWfbbbebnk3OiM2JS6FSI/values/Sheet1!A2:E/"
    val URL_GROCERIES = BASE_URL + "1XM7FTuu2_ZImVy98IGHvC5D9z3MiB_4ju_A4ey31Anw/values/Sheet1!A2:E/"
    val URL_MEDICINES = BASE_URL + "1C5pHtKsf0tmdb7RwFxwHDCQF4z3VbHtEx3TlQOAOv6g/values/Sheet1!A2:E/"
    val URL_SUPPLEMENTS = BASE_URL + "1ozhQgG463OmkKcDbYqv-3caG_MU-xE_9C2gQyAD2vL0/values/Sheet1!A2:E/"
    val URL_ELECTRONICS = BASE_URL + "1zMfntZDdXeWPZie1K-sSGQhhXcjf1BhJLGWWg_vPNmU/values/Sheet1!A2:E/"
    val URL_BEAUTY = BASE_URL + "1P7H7a9jgr_70frBv31XFi3kb0wT0wL--FcbFVupc3kg/values/Sheet1!A2:E/"
    val URL_JEWELLERY = BASE_URL + "1Iz2bWrUKi-Eccod5Vzs1kVkpP5Lb2lam7JeBm8bcUE8/values/Sheet1!A2:E/"
    val URL_KITCHEN_APPLIANCES = BASE_URL + "1CyjROiioeZBqHQ_BpefmR-7Q9LJH_9zz9plzH5Yy_Ic/values/Sheet1!A2:E/"
    val URL_KIDS_LIFESTYLE = BASE_URL + "11mT4ZC_wZixfgZtabEliwE1I13E6LLjFwztDBelYcWU/values/Sheet1!A2:E/"
    val URL_BABY_TOYS = BASE_URL + "16N8jPD30zl72SPbDJ0wc3u68eym201lWsOP4huALhMo/values/Sheet1!A2:E/"
    val URL_LINGERIE = BASE_URL + "19X0ZsBAIGK6JklAOMadXLr3eGfazkBi9yB548jRisfQ/values/Sheet1!A2:E/"
    val URL_MEN_INNER_WEAR = BASE_URL + "1YwwpkVGTsUNNb9JiuTcoaMLFvE56fvN3pKHiStOj79w/values/Sheet1!A2:E/"


    val KEY = "AIzaSyCANMG2wzSKUeM8AbqQ14Zj48VK5-cBQzI"

    val URL_DEALS_DATA = BASE_URL + "1UG9ZrSR-lEuTgV1zb0yM2pYEdrucTzERXoMBYgxql1E/values/Sheet1!A2:F/"


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