package com.syafiqaqilahsapplication.app.modules.welcomescreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syafiqaqilahsapplication.app.modules.welcomescreenone.`data`.model.ViewhierarchyRowModel
import com.syafiqaqilahsapplication.app.modules.welcomescreenone.`data`.model.WelcomeScreenoneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class WelcomeScreenoneVM : ViewModel(), KoinComponent {
  val welcomeScreenoneModel: MutableLiveData<WelcomeScreenoneModel> =
      MutableLiveData(WelcomeScreenoneModel())

  var navArguments: Bundle? = null

  val viewhierarchyList: MutableLiveData<MutableList<ViewhierarchyRowModel>> =
      MutableLiveData(mutableListOf())
}
