package com.madhursapplication.app.modules.homepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madhursapplication.app.R
import com.madhursapplication.app.databinding.RowListhomeBinding
import com.madhursapplication.app.modules.homepage.`data`.model.ListhomeRowModel
import kotlin.Int
import kotlin.collections.List

class ListhomeAdapter(
  var list: List<ListhomeRowModel>
) : RecyclerView.Adapter<ListhomeAdapter.RowListhomeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListhomeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listhome,parent,false)
    return RowListhomeVH(view)
  }

  override fun onBindViewHolder(holder: RowListhomeVH, position: Int) {
    val listhomeRowModel = ListhomeRowModel()
    // TODO uncomment following line after integration with data source
    // val listhomeRowModel = list[position]
    holder.binding.listhomeRowModel = listhomeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListhomeRowModel>) {
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
      item: ListhomeRowModel
    ) {
    }
  }

  inner class RowListhomeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListhomeBinding = RowListhomeBinding.bind(itemView)
  }
}
