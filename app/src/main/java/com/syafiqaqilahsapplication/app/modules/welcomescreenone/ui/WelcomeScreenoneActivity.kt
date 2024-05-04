package com.syafiqaqilahsapplication.app.modules.welcomescreenone.ui

import android.view.View
import androidx.activity.viewModels
import com.syafiqaqilahsapplication.app.R
import com.syafiqaqilahsapplication.app.appcomponents.base.BaseActivity
import com.syafiqaqilahsapplication.app.databinding.ActivityWelcomeScreenoneBinding
import com.syafiqaqilahsapplication.app.modules.welcomescreenone.`data`.model.ViewhierarchyRowModel
import com.syafiqaqilahsapplication.app.modules.welcomescreenone.`data`.viewmodel.WelcomeScreenoneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class WelcomeScreenoneActivity :
    BaseActivity<ActivityWelcomeScreenoneBinding>(R.layout.activity_welcome_screenone) {
  private val viewModel: WelcomeScreenoneVM by viewModels<WelcomeScreenoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val viewhierarchyAdapter =
    ViewhierarchyAdapter(viewModel.viewhierarchyList.value?:mutableListOf())
    binding.recyclerViewhierarchy.adapter = viewhierarchyAdapter
    viewhierarchyAdapter.setOnItemClickListener(
    object : ViewhierarchyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ViewhierarchyRowModel) {
        onClickRecyclerViewhierarchy(view, position, item)
      }
    }
    )
    viewModel.viewhierarchyList.observe(this) {
      viewhierarchyAdapter.updateData(it)
    }
    binding.welcomeScreenoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerViewhierarchy(
    view: View,
    position: Int,
    item: ViewhierarchyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "WELCOME_SCREENONE_ACTIVITY"

  }
}
