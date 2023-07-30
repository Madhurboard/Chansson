package com.madhursapplication.app.modules.search.`data`.model

import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchRowModel(
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
  var txtStockLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_fear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_songs)

)
