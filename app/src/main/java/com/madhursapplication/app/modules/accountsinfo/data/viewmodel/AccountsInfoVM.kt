package com.madhursapplication.app.modules.accountsinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.madhursapplication.app.modules.accountsinfo.`data`.model.AccountsInfoModel
import com.madhursapplication.app.modules.accountsinfo.`data`.model.AccountsInfoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountsInfoVM : ViewModel(), KoinComponent {
  val accountsInfoModel: MutableLiveData<AccountsInfoModel> = MutableLiveData(AccountsInfoModel())

  var navArguments: Bundle? = null

  val accountsInfoList: MutableLiveData<MutableList<AccountsInfoRowModel>> =
      MutableLiveData(mutableListOf())
}
