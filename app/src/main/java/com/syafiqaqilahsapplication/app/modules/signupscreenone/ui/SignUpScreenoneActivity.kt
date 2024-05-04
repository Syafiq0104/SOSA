package com.syafiqaqilahsapplication.app.modules.signupscreenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.base.BaseActivity
import com.syafiqaqilahsapplication.app.databinding.ActivitySignUpScreenoneBinding
import com.syafiqaqilahsapplication.app.modules.signupscreenone.`data`.viewmodel.SignUpScreenoneVM
import kotlin.String
import kotlin.Unit

class SignUpScreenoneActivity :
    BaseActivity<ActivitySignUpScreenoneBinding>(R.layout.activity_sign_up_screenone) {
  private val viewModel: SignUpScreenoneVM by viewModels<SignUpScreenoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpScreenoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_SCREENONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpScreenoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
