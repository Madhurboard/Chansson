package com.madhursapplication.app.modules.lyricpage.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LyricPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_chill_song)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSectionTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_current_song)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMidnightClock: String? =
      MyApp.getInstance().resources.getString(R.string.msg_midnight_clock)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOBESN: String? = MyApp.getInstance().resources.getString(R.string.lbl_obes_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_happy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSectionTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lyrics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_so_tell_me_plea)

)
