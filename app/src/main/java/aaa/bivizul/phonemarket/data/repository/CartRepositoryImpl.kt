package aaa.bivizul.phonemarket.data.repository

import aaa.bivizul.phonemarket.data.network.MarketService
import aaa.bivizul.phonemarket.domain.model.Cart
import aaa.bivizul.phonemarket.domain.repository.CartRepository
import retrofit2.Response
import javax.inject.Inject

class CartRepositoryImpl @Inject constructor(val marketService: MarketService) :
    CartRepository {

    override suspend fun getCart(): Response<Cart> {
        return marketService.getCart()
    }

}