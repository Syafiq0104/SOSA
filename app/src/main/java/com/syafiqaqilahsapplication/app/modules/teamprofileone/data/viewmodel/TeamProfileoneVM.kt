package com.syafiqaqilahsapplication.app.modules.teamprofileone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syafiqaqilahsapplication.app.modules.teamprofileone.`data`.model.TeamProfileoneModel
import org.koin.core.KoinComponent

class TeamProfileoneVM : ViewModel(), KoinComponent {
  val teamProfileoneModel: MutableLiveData<TeamProfileoneModel> =
      MutableLiveData(TeamProfileoneModel())

  var navArguments: Bundle? = null
}
