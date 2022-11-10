package aaa.bivizul.phonemarket.domain.di

import aaa.bivizul.phonemarket.data.repository.PhoneRepositoryImpl
import aaa.bivizul.phonemarket.domain.repository.PhoneRepository
import dagger.Binds
import dagger.Module

@Module
interface AppBindModule {

    @Suppress("FunctionName")
    @Binds
    fun bindPhoneRepositoryImpl_to_PhoneRepository(
        phoneRepositoryImpl: PhoneRepositoryImpl
    ): PhoneRepository

}