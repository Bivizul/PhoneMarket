package aaa.bivizul.phonemarket.presentation.viewmodels

import aaa.bivizul.phonemarket.domain.model.Phone
import aaa.bivizul.phonemarket.domain.repository.PhoneRepository
import aaa.bivizul.phonemarket.domain.usecase.GetPhoneUseCase
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch

class PhoneViewModel (private val phoneRepository: PhoneRepository) : ViewModel() {

    private val getPhoneUseCase = GetPhoneUseCase(phoneRepository)

//    private val _phone = MutableLiveData<Phone>()
//    val phone : LiveData<Phone> = _phone
//
//    init {
//        getPhone()
//    }
//
//    fun getPhone() {
//        viewModelScope.launch(Dispatchers.IO) {
//            Log.e("qwer", "getPhone 2")
//            val response = getPhoneUseCase()
////            val response = phoneRepository.getPhone()
//            Log.e("qwer", "getPhone 3")
//            Log.e("qwer", "response : ${response.body()}")
//            if (response.isSuccessful){
//                response.body()?.let {
//                    _phone.postValue(it)
//                }
//            }
//        }
//    }

    val phone: SharedFlow<Phone> =
        flow<Phone> {
            phoneRepository.getPhone()
//            getPhoneUseCase()
//            Log.e("qwer", "response : ${phoneRepository.getPhone().body()}")
        }
            .shareIn(viewModelScope, SharingStarted.Lazily, replay = 1)

}

class PhoneViewModelFactory @AssistedInject constructor(
    private val phoneRepository: PhoneRepository,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        require(modelClass == PhoneViewModel::class)
        return PhoneViewModel(phoneRepository) as T
    }

    @AssistedFactory
    interface Factory {
        fun create(): PhoneViewModelFactory
    }

}