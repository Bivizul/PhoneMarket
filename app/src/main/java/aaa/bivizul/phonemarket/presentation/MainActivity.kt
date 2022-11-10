package aaa.bivizul.phonemarket.presentation

import aaa.bivizul.phonemarket.R
import aaa.bivizul.phonemarket.domain.di.appComponent
import aaa.bivizul.phonemarket.presentation.viewmodels.PhoneViewModel
import aaa.bivizul.phonemarket.presentation.viewmodels.PhoneViewModelFactory
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val viewModel: PhoneViewModel by viewModels { factory.create() }

    @Inject
    lateinit var factory: PhoneViewModelFactory.Factory

//    private val viewModel by viewModels<PhoneViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("qwer", "MainActivity onCreate 1")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("qwer", "MainActivity onCreate 2")
//        appComponent.inject(this)
        appComponent.inject(this)
        Log.e("qwer", "MainActivity onCreate 3")

        try {
            Log.e("qwer", "onCreate try")
            viewModel.getPhone()
        } catch (e: Exception) {
            Log.e("qwer", "Error viewModel : $e")
        }

    }


}