package com.syafiqaqilahsapplication.app.modules.signupscreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syafiqaqilahsapplication.app.modules.signupscreenone.`data`.model.SignUpScreenoneModel
import org.koin.core.KoinComponent

class SignUpScreenoneVM : ViewModel(), KoinComponent {
  val signUpScreenoneModel: MutableLiveData<SignUpScreenoneModel> =
      MutableLiveData(SignUpScreenoneModel())

  var navArguments: Bundle? = null
}
