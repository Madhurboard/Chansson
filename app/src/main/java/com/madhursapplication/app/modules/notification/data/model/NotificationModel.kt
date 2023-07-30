package com.madhursapplication.app.modules.notification.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_15min_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_beyonce_launch)

)
