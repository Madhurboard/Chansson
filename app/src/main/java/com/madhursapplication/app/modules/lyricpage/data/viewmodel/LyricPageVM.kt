package com.madhursapplication.app.modules.lyricpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.madhursapplication.app.modules.lyricpage.`data`.model.LyricPageModel
import org.koin.core.KoinComponent

class LyricPageVM : ViewModel(), KoinComponent {
  val lyricPageModel: MutableLiveData<LyricPageModel> = MutableLiveData(LyricPageModel())

  var navArguments: Bundle? = null
}
