package com.sdk.mytestapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.sdk.mytestapp.R
import com.sdk.mytestapp.databinding.FragmentHomeBinding
import com.sdk.readyassist.ui.bookService.adapters.ShowAdapter

class HomeFragment : Fragment() {

  private lateinit var homeViewModel: HomeViewModel
private var _binding: FragmentHomeBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!
    private lateinit var showAdapter: ShowAdapter

    override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    homeViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(HomeViewModel::class.java)

    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root

        val listItems=ArrayList<String>()
        listItems.add("1")
        listItems.add("1")
        listItems.add("1")
        listItems.add("1")
        listItems.add("1")
        listItems.add("1")

      showAdapter = ShowAdapter()
      binding.recyclerview.layoutManager = LinearLayoutManager(requireActivity())
      binding.recyclerview.setHasFixedSize(true);
      binding.recyclerview.getRecycledViewPool().setMaxRecycledViews(0, 10);
      binding.recyclerview.setItemViewCacheSize(10);
      binding.recyclerview.scheduleLayoutAnimation()
      binding.recyclerview.adapter = showAdapter
        showAdapter.setItems(listItems)

      return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}