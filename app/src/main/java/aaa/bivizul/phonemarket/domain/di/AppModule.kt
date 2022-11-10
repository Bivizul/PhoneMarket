package aaa.bivizul.phonemarket.domain.di

import aaa.bivizul.phonemarket.data.network.NetworkApi
import dagger.Module

@Module(includes = [NetworkApi::class, AppBindModule::class])
class AppModule {
}