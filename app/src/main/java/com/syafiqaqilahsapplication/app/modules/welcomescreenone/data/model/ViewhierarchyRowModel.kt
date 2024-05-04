package com.syafiqaqilahsapplication.app.modules.welcomescreenone.`data`.model

import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewhierarchyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_prevent_cancer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViews: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_4k_views)

)
