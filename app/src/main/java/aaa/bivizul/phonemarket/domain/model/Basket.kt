package aaa.bivizul.phonemarket.domain.model


import androidx.annotation.Keep

@Keep
data class Basket(
    val id: Int,
    val images: String,
    val price: Int,
    val title: String
)