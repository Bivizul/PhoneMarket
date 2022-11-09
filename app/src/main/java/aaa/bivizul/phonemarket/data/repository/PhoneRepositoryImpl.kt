package aaa.bivizul.phonemarket.data.repository

import aaa.bivizul.phonemarket.domain.model.Phone
import aaa.bivizul.phonemarket.domain.repository.PhoneRepository
import retrofit2.Response
import javax.inject.Inject

class PhoneRepositoryImpl @Inject constructor(private val phoneRepository: PhoneRepository) :
    PhoneRepository {

    override suspend fun getPhone(): Response<Phone> = phoneRepository.getPhone()

}