package aaa.bivizul.phonemarket.domain.repository

import aaa.bivizul.phonemarket.domain.model.Phone
import retrofit2.Response

interface PhoneRepository {

    suspend fun getPhone(): Response<Phone>

}