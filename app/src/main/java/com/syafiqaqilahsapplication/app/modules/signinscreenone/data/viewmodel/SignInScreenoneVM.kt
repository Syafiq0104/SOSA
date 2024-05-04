package com.syafiqaqilahsapplication.app.modules.signinscreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syafiqaqilahsapplication.app.modules.signinscreenone.`data`.model.SignInScreenoneModel
import org.koin.core.KoinComponent

class SignInScreenoneVM : ViewModel(), KoinComponent {
  val signInScreenoneModel: MutableLiveData<SignInScreenoneModel> =
      MutableLiveData(SignInScreenoneModel())

  var navArguments: Bundle? = null
}
