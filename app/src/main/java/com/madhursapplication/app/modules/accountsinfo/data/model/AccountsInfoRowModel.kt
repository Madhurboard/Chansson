package com.madhursapplication.app.modules.accountsinfo.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountsInfoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSpotify: String? = MyApp.getInstance().resources.getString(R.string.lbl_spotify)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMikePanther: String? = MyApp.getInstance().resources.getString(R.string.lbl_mike_panther)

)
