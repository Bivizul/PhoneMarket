package aaa.bivizul.phonemarket.domain.di

import aaa.bivizul.phonemarket.presentation.MainActivity
import aaa.bivizul.phonemarket.presentation.PhoneFragment
import dagger.Component
import javax.inject.Qualifier
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(phoneFragment: PhoneFragment)

}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Prod


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Stage