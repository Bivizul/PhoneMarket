package aaa.bivizul.phonemarket.data.network

import aaa.bivizul.phonemarket.domain.di.Stage
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkApi {

    @Provides
    fun baseUrl() = BASE_URL

    @Provides
    fun logging() = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    @Provides
    fun okHttpClient() = OkHttpClient.Builder()
        .addInterceptor(logging())
        .build()

    @Provides
    @Singleton
//    @Stage
    fun provideRetrofit(baseUrl: String): MarketService =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MarketService::class.java)

    companion object {
        const val BASE_URL = "https://run.mocky.io/"
    }

}