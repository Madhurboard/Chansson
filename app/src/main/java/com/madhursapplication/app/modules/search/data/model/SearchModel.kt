package com.madhursapplication.app.modules.search.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_song_artist_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStarttypingto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_typing_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_calm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_64_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_temper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabelFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_surprise)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_38_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabelFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_calm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_38_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStockLabelSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_love)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_101_songs)

)
