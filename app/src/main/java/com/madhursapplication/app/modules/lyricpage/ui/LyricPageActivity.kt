package com.madhursapplication.app.modules.lyricpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.base.BaseActivity
import com.madhursapplication.app.databinding.ActivityLyricPageBinding
import com.madhursapplication.app.modules.lyricpage.`data`.viewmodel.LyricPageVM
import kotlin.String
import kotlin.Unit

class LyricPageActivity : BaseActivity<ActivityLyricPageBinding>(R.layout.activity_lyric_page) {
  private val viewModel: LyricPageVM by viewModels<LyricPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lyricPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "LYRIC_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LyricPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
