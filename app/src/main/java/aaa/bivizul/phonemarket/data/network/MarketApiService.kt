package aaa.bivizul.phonemarket.data.network

import aaa.bivizul.phonemarket.domain.model.Cart
import aaa.bivizul.phonemarket.domain.model.Market
import aaa.bivizul.phonemarket.domain.model.Phone
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarketApiService {

    @GET("v3/654bd15e-b121-49ba-a588-960956b15175")
    suspend fun getMarket(): Response<Market>

    @GET("v3/6c14c560-15c6-4248-b9d2-b4508df7d4f5")
    suspend fun getPhone(): Response<Phone>

    @GET("/v3/53539a72-3c5f-4f30-bbb1-6ca10d42c149")
    suspend fun getCart(): Response<Cart>
}