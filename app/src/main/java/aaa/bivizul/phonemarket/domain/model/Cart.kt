package aaa.bivizul.phonemarket.domain.model


import androidx.annotation.Keep

@Keep
data class Cart(
    val basket: List<Basket>,
    val delivery: String,
    val id: String,
    val total: Int
)