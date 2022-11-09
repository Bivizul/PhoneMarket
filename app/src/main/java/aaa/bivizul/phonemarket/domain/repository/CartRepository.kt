package aaa.bivizul.phonemarket.domain.repository

import aaa.bivizul.phonemarket.domain.model.Cart
import retrofit2.Response

interface CartRepository {

    suspend fun getCart(): Response<Cart>

}