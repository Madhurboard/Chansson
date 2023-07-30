package com.madhursapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.base.BaseActivity
import com.madhursapplication.app.databinding.ActivitySignUpBinding
import com.madhursapplication.app.modules.createaccount.ui.CreateAccountActivity
import com.madhursapplication.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCreateAccount.setOnClickListener {
      val destIntent = CreateAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
