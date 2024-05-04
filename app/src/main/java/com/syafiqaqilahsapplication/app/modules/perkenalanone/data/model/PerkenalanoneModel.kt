package com.syafiqaqilahsapplication.app.modules.perkenalanone.`data`.model

import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PerkenalanoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_sosa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSolarsafe: String? = MyApp.getInstance().resources.getString(R.string.lbl_solar_safe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOurproject: String? = MyApp.getInstance().resources.getString(R.string.lbl_our_project)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sosa_is_software)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightmode: String? = MyApp.getInstance().resources.getString(R.string.lbl_light_mode)

)
