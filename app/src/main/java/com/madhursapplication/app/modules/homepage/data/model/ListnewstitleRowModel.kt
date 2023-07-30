package com.madhursapplication.app.modules.homepage.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnewstitleRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewsTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_arijit_singh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewsDescriptio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_songs_kesariya)

)
