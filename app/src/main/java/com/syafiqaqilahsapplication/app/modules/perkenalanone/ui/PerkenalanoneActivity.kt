package com.syafiqaqilahsapplication.app.modules.perkenalanone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.base.BaseActivity
import com.syafiqaqilahsapplication.app.databinding.ActivityPerkenalanoneBinding
import com.syafiqaqilahsapplication.app.modules.perkenalanone.`data`.viewmodel.PerkenalanoneVM
import com.syafiqaqilahsapplication.app.modules.signupscreenone.ui.SignUpScreenoneActivity
import kotlin.String
import kotlin.Unit

class PerkenalanoneActivity :
    BaseActivity<ActivityPerkenalanoneBinding>(R.layout.activity_perkenalanone) {
  private val viewModel: PerkenalanoneVM by viewModels<PerkenalanoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.perkenalanoneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SignUpScreenoneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "PERKENALANONE_ACTIVITY"

    }
  }
