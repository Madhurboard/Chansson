package com.madhursapplication.app.modules.accountsinfo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.base.BaseActivity
import com.madhursapplication.app.databinding.ActivityAccountsInfoBinding
import com.madhursapplication.app.modules.accountsinfo.`data`.model.AccountsInfoRowModel
import com.madhursapplication.app.modules.accountsinfo.`data`.viewmodel.AccountsInfoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountsInfoActivity :
    BaseActivity<ActivityAccountsInfoBinding>(R.layout.activity_accounts_info) {
  private val viewModel: AccountsInfoVM by viewModels<AccountsInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val accountsInfoAdapter =
    AccountsInfoAdapter(viewModel.accountsInfoList.value?:mutableListOf())
    binding.recyclerAccountsInfo.adapter = accountsInfoAdapter
    accountsInfoAdapter.setOnItemClickListener(
    object : AccountsInfoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AccountsInfoRowModel) {
        onClickRecyclerAccountsInfo(view, position, item)
      }
    }
    )
    viewModel.accountsInfoList.observe(this) {
      accountsInfoAdapter.updateData(it)
    }
    binding.accountsInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerAccountsInfo(
    view: View,
    position: Int,
    item: AccountsInfoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACCOUNTS_INFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountsInfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
