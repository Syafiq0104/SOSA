package com.syafiqaqilahsapplication.app.modules.welcomescreenone.`data`.model

import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreenoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHello: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGuest: String? = MyApp.getInstance().resources.getString(R.string.lbl_guest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchnews: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLatestnews: String? = MyApp.getInstance().resources.getString(R.string.lbl_latest_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cancer_treatment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancer: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkinanalysis: String? = MyApp.getInstance().resources.getString(R.string.lbl_skin_analysis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmityour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_submit_your_skin)

)
