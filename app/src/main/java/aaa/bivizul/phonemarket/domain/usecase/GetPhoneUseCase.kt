package aaa.bivizul.phonemarket.domain.usecase

import aaa.bivizul.phonemarket.domain.repository.PhoneRepository
import javax.inject.Inject

class GetPhoneUseCase @Inject constructor(private val phoneRepository: PhoneRepository) {

    suspend operator fun invoke() = phoneRepository.getPhone()

}