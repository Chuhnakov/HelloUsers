package com.example.hellousers.ui.sharedViewModel.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hellousers.databinding.FragmentHomeBinding
import com.example.hellousers.ui.sharedViewModel.SharedViewModel

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: SharedViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!





    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(SharedViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        Log.d("MyLog", "Home Fragment On Create")
        val lv: ListView = binding.lvUsers

            // val usersList: LiveData<MutableList<User>?>? = sharedViewModel.getUsersData()
       // val la: ListAdapter<User> = usersList?.value
        //lv.adapter(la)
        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MyLog", "Home Fragment On Destroy")
        _binding = null
    }
}