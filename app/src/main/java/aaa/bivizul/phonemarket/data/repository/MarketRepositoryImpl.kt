package aaa.bivizul.phonemarket.data.repository

import aaa.bivizul.phonemarket.data.network.MarketService
import aaa.bivizul.phonemarket.domain.model.Market
import aaa.bivizul.phonemarket.domain.repository.MarketRepository
import retrofit2.Response
import javax.inject.Inject

class MarketRepositoryImpl @Inject constructor(val marketService: MarketService) :
    MarketRepository {

    override suspend fun getMarket(): Response<Market> {
        return marketService.getMarket()
    }

}