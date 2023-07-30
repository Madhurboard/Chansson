package com.madhursapplication.app.modules.homepagecontainer.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_song)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLyricsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lyrics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
