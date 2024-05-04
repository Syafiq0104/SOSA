package com.syafiqaqilahsapplication.app.modules.perkenalanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syafiqaqilahsapplication.app.modules.perkenalanone.`data`.model.PerkenalanoneModel
import org.koin.core.KoinComponent

class PerkenalanoneVM : ViewModel(), KoinComponent {
  val perkenalanoneModel: MutableLiveData<PerkenalanoneModel> =
      MutableLiveData(PerkenalanoneModel())

  var navArguments: Bundle? = null
}
