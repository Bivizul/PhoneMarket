package aaa.bivizul.phonemarket.presentation

import aaa.bivizul.phonemarket.R
import aaa.bivizul.phonemarket.domain.di.appComponent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)

        val fragmentManager = supportFragmentManager
        if (fragmentManager.findFragmentById(R.id.fragmentContainer) == null) {
            fragmentManager.commit {
                add<PhoneFragment>(R.id.fragmentContainer, FRAGMENT_PHONE)
            }
        }

    }

    private companion object {

        private const val FRAGMENT_PHONE = "phone"

    }


}