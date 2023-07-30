package com.madhursapplication.app.modules.signup.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_stay_on_top_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_placeholder_tex)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)

)
