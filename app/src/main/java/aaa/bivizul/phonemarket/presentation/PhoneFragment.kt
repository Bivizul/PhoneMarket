package aaa.bivizul.phonemarket.presentation

import aaa.bivizul.phonemarket.R
import aaa.bivizul.phonemarket.databinding.FragmentPhoneBinding
import aaa.bivizul.phonemarket.domain.di.appComponent
import aaa.bivizul.phonemarket.domain.model.Phone
import aaa.bivizul.phonemarket.presentation.viewmodels.PhoneViewModel
import aaa.bivizul.phonemarket.presentation.viewmodels.PhoneViewModelFactory
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.repeatOnLifecycle
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.launch
import javax.inject.Inject

class PhoneFragment : Fragment(R.layout.fragment_phone) {

    @Inject
    lateinit var factory: PhoneViewModelFactory.Factory

    private val binding by viewBinding(FragmentPhoneBinding::bind)
    private val viewModel: PhoneViewModel by viewModels { factory.create() }

    override fun onAttach(context: Context) {
        context.appComponent.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewLifecycleOwner.lifecycle.coroutineScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.phone.collect(::updateUi)
            }
        }
    }

    private fun updateUi(phone: Phone) {
        if (view == null) return
        with(binding) {
            cpu.text = phone.title
        }
    }


}
