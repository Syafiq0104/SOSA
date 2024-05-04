package com.syafiqaqilahsapplication.app.modules.signinscreenone.`data`.model

import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignInScreenoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
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
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dont_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
