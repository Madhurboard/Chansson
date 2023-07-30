package com.madhursapplication.app.modules.homepagecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.base.BaseActivity
import com.madhursapplication.app.databinding.ActivityHomepageContainerBinding
import com.madhursapplication.app.extensions.loadFragment
import com.madhursapplication.app.modules.homepage.ui.HomepageFragment
import com.madhursapplication.app.modules.homepagecontainer.`data`.viewmodel.HomepageContainerVM
import com.madhursapplication.app.modules.lyricpage.ui.LyricPageActivity
import kotlin.String
import kotlin.Unit

class HomepageContainerActivity :
    BaseActivity<ActivityHomepageContainerBinding>(R.layout.activity_homepage_container) {
  private val viewModel: HomepageContainerVM by viewModels<HomepageContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageContainerVM = viewModel
    val destFragment = HomepageFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomepageFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnhomeOne.setOnClickListener {
      val destFragment = HomepageFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = HomepageFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageMusicOne.setOnClickListener {
      val destIntent = LyricPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
