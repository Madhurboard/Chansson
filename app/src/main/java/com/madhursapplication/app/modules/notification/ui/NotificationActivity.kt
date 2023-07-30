package com.madhursapplication.app.modules.notification.ui

import android.view.View
import androidx.activity.viewModels
import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.base.BaseActivity
import com.madhursapplication.app.databinding.ActivityNotificationBinding
import com.madhursapplication.app.modules.notification.`data`.model.NotificationRowModel
import com.madhursapplication.app.modules.notification.`data`.viewmodel.NotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val notificationAdapter =
    NotificationAdapter(viewModel.notificationList.value?:mutableListOf())
    binding.recyclerNotification.adapter = notificationAdapter
    notificationAdapter.setOnItemClickListener(
    object : NotificationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificationRowModel) {
        onClickRecyclerNotification(view, position, item)
      }
    }
    )
    viewModel.notificationList.observe(this) {
      notificationAdapter.updateData(it)
    }
    binding.notificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerNotification(
    view: View,
    position: Int,
    item: NotificationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ACTIVITY"

  }
}
