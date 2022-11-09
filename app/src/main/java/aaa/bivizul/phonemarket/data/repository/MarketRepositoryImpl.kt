package aaa.bivizul.phonemarket.data.repository

import aaa.bivizul.phonemarket.data.network.MarketApiService
import aaa.bivizul.phonemarket.domain.model.Market
import aaa.bivizul.phonemarket.domain.repository.MarketRepository
import retrofit2.Response
import javax.inject.Inject

class MarketRepositoryImpl @Inject constructor(private val marketApiService: MarketApiService) :
    MarketRepository {

    override suspend fun getMarket(): Response<Market> = marketApiService.getMarket()

}