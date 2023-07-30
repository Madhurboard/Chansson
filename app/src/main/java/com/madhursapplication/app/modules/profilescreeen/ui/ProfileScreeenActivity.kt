package com.madhursapplication.app.modules.profilescreeen.ui

import androidx.activity.viewModels
import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.base.BaseActivity
import com.madhursapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.madhursapplication.app.databinding.ActivityProfileScreeenBinding
import com.madhursapplication.app.modules.accountsinfo.ui.AccountsInfoActivity
import com.madhursapplication.app.modules.profilescreeen.`data`.viewmodel.ProfileScreeenVM
import kotlin.String
import kotlin.Unit

class ProfileScreeenActivity :
    BaseActivity<ActivityProfileScreeenBinding>(R.layout.activity_profile_screeen) {
  private val viewModel: ProfileScreeenVM by viewModels<ProfileScreeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileScreeenVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowrightOne.setOnClickListener {
      val destIntent = AccountsInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_SCREEEN_ACTIVITY"

  }
}
