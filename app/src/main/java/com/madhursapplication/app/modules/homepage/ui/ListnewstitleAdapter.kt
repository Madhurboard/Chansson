package com.madhursapplication.app.modules.homepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madhursapplication.app.R
import com.madhursapplication.app.databinding.RowListnewstitleBinding
import com.madhursapplication.app.modules.homepage.`data`.model.ListnewstitleRowModel
import kotlin.Int
import kotlin.collections.List

class ListnewstitleAdapter(
  var list: List<ListnewstitleRowModel>
) : RecyclerView.Adapter<ListnewstitleAdapter.RowListnewstitleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewstitleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewstitle,parent,false)
    return RowListnewstitleVH(view)
  }

  override fun onBindViewHolder(holder: RowListnewstitleVH, position: Int) {
    val listnewstitleRowModel = ListnewstitleRowModel()
    // TODO uncomment following line after integration with data source
    // val listnewstitleRowModel = list[position]
    holder.binding.listnewstitleRowModel = listnewstitleRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnewstitleRowModel>) {
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
      item: ListnewstitleRowModel
    ) {
    }
  }

  inner class RowListnewstitleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewstitleBinding = RowListnewstitleBinding.bind(itemView)
  }
}
