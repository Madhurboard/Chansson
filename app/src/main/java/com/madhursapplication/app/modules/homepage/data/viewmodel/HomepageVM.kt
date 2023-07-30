package com.madhursapplication.app.modules.homepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.madhursapplication.app.modules.homepage.`data`.model.HomepageModel
import com.madhursapplication.app.modules.homepage.`data`.model.ListhomeRowModel
import com.madhursapplication.app.modules.homepage.`data`.model.ListnewstitleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageVM : ViewModel(), KoinComponent {
  val homepageModel: MutableLiveData<HomepageModel> = MutableLiveData(HomepageModel())

  var navArguments: Bundle? = null

  val listnewstitleList: MutableLiveData<MutableList<ListnewstitleRowModel>> =
      MutableLiveData(mutableListOf())

  val listhomeList: MutableLiveData<MutableList<ListhomeRowModel>> =
      MutableLiveData(mutableListOf())
}
