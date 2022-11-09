package aaa.bivizul.phonemarket.domain.repository

import aaa.bivizul.phonemarket.domain.model.Market
import retrofit2.Response

interface MarketRepository {

    suspend fun getMarket():Response<Market>

}