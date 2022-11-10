package aaa.bivizul.phonemarket.data.repository

import aaa.bivizul.phonemarket.data.network.MarketService
import aaa.bivizul.phonemarket.domain.model.Phone
import aaa.bivizul.phonemarket.domain.repository.PhoneRepository
import retrofit2.Response
import javax.inject.Inject

class PhoneRepositoryImpl @Inject constructor(private val marketService: MarketService) :
    PhoneRepository {

    override suspend fun getPhone(): Response<Phone> {
        return marketService.getPhone()
    }

}