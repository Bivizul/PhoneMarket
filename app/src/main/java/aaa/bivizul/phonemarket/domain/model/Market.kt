package aaa.bivizul.phonemarket.domain.model


import androidx.annotation.Keep

@Keep
data class Market(
    val best_seller: List<BestSeller>,
    val home_store: List<HomeStore>
)