package com.madhursapplication.app.modules.homepage.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_jessie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleLabel: String? = MyApp.getInstance().resources.getString(R.string.msg_most_listened_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAssetLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_energetic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSectionTitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_more_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_happy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_happy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_calm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_38_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabelThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_sad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSectionTitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_artists)

)
