package com.syafiqaqilahsapplication.app.modules.signinscreenone.ui

import androidx.activity.viewModels
import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.base.BaseActivity
import com.syafiqaqilahsapplication.app.databinding.ActivitySignInScreenoneBinding
import com.syafiqaqilahsapplication.app.modules.signinscreenone.`data`.viewmodel.SignInScreenoneVM
import kotlin.String
import kotlin.Unit

class SignInScreenoneActivity :
    BaseActivity<ActivitySignInScreenoneBinding>(R.layout.activity_sign_in_screenone) {
  private val viewModel: SignInScreenoneVM by viewModels<SignInScreenoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInScreenoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_IN_SCREENONE_ACTIVITY"

  }
}
