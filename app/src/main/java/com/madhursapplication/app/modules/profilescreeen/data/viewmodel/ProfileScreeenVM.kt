package com.madhursapplication.app.modules.profilescreeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.madhursapplication.app.modules.profilescreeen.`data`.model.ProfileScreeenModel
import org.koin.core.KoinComponent

class ProfileScreeenVM : ViewModel(), KoinComponent {
  val profileScreeenModel: MutableLiveData<ProfileScreeenModel> =
      MutableLiveData(ProfileScreeenModel())

  var navArguments: Bundle? = null
}
