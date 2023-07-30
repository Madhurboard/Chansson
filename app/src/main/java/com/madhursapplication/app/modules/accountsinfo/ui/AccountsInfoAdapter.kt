package com.madhursapplication.app.modules.accountsinfo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madhursapplication.app.R
import com.madhursapplication.app.databinding.RowAccountsInfoBinding
import com.madhursapplication.app.modules.accountsinfo.`data`.model.AccountsInfoRowModel
import kotlin.Int
import kotlin.collections.List

class AccountsInfoAdapter(
  var list: List<AccountsInfoRowModel>
) : RecyclerView.Adapter<AccountsInfoAdapter.RowAccountsInfoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAccountsInfoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_accounts_info,parent,false)
    return RowAccountsInfoVH(view)
  }

  override fun onBindViewHolder(holder: RowAccountsInfoVH, position: Int) {
    val accountsInfoRowModel = AccountsInfoRowModel()
    // TODO uncomment following line after integration with data source
    // val accountsInfoRowModel = list[position]
    holder.binding.accountsInfoRowModel = accountsInfoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AccountsInfoRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: AccountsInfoRowModel
    ) {
    }
  }

  inner class RowAccountsInfoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAccountsInfoBinding = RowAccountsInfoBinding.bind(itemView)
  }
}
