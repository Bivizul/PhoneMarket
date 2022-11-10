package aaa.bivizul.phonemarket.domain.di

import android.app.Application
import android.content.Context

class PhoneMarketApp : Application() {

    //    val appComponent: AppComponent by lazy { DaggerAppComponent.create() }
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is PhoneMarketApp -> appComponent
        else -> applicationContext.appComponent
    }