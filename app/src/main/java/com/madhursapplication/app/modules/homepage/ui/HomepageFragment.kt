package com.madhursapplication.app.modules.homepage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.madhursapplication.app.R
import com.madhursapplication.app.appcomponents.base.BaseFragment
import com.madhursapplication.app.databinding.FragmentHomepageBinding
import com.madhursapplication.app.modules.homepage.`data`.model.ListhomeRowModel
import com.madhursapplication.app.modules.homepage.`data`.model.ListnewstitleRowModel
import com.madhursapplication.app.modules.homepage.`data`.viewmodel.HomepageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageFragment : BaseFragment<FragmentHomepageBinding>(R.layout.fragment_homepage) {
  private val viewModel: HomepageVM by viewModels<HomepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listnewstitleAdapter =
    ListnewstitleAdapter(viewModel.listnewstitleList.value?:mutableListOf())
    binding.recyclerListnewstitle.adapter = listnewstitleAdapter
    listnewstitleAdapter.setOnItemClickListener(
    object : ListnewstitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnewstitleRowModel) {
        onClickRecyclerListnewstitle(view, position, item)
      }
    }
    )
    viewModel.listnewstitleList.observe(requireActivity()) {
      listnewstitleAdapter.updateData(it)
    }
    val listhomeAdapter = ListhomeAdapter(viewModel.listhomeList.value?:mutableListOf())
    binding.recyclerListhome.adapter = listhomeAdapter
    listhomeAdapter.setOnItemClickListener(
    object : ListhomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListhomeRowModel) {
        onClickRecyclerListhome(view, position, item)
      }
    }
    )
    viewModel.listhomeList.observe(requireActivity()) {
      listhomeAdapter.updateData(it)
    }
    binding.homepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListnewstitle(
    view: View,
    position: Int,
    item: ListnewstitleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListhome(
    view: View,
    position: Int,
    item: ListhomeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomepageFragment {
      val fragment = HomepageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
