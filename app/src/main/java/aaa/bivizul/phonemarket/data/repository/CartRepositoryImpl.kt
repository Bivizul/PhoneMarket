package aaa.bivizul.phonemarket.data.repository

import aaa.bivizul.phonemarket.data.network.MarketApiService
import aaa.bivizul.phonemarket.domain.model.Cart
import aaa.bivizul.phonemarket.domain.repository.CartRepository
import retrofit2.Response
import javax.inject.Inject

class CartRepositoryImpl @Inject constructor(private val marketApiService: MarketApiService) :
    CartRepository {

    override suspend fun getCart(): Response<Cart> = marketApiService.getCart()

}