package com.syafiqaqilahsapplication.app.modules.teamprofileone.ui

import androidx.activity.viewModels
import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.base.BaseActivity
import com.syafiqaqilahsapplication.app.databinding.ActivityTeamProfileoneBinding
import com.syafiqaqilahsapplication.app.modules.teamprofileone.`data`.viewmodel.TeamProfileoneVM
import kotlin.String
import kotlin.Unit

class TeamProfileoneActivity :
    BaseActivity<ActivityTeamProfileoneBinding>(R.layout.activity_team_profileone) {
  private val viewModel: TeamProfileoneVM by viewModels<TeamProfileoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.teamProfileoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TEAM_PROFILEONE_ACTIVITY"

  }
}
