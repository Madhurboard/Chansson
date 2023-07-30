package com.madhursapplication.app.modules.notification.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitleTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_mood_just_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_3min_ago)

)
