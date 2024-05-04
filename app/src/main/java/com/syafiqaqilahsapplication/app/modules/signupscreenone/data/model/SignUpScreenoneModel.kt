package com.syafiqaqilahsapplication.app.modules.signupscreenone.`data`.model

import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpScreenoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegisterwith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_register_with_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYour: String? = MyApp.getInstance().resources.getString(R.string.msg_your_information)
  ,
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
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFullNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPassword1Value: String? = null
)
