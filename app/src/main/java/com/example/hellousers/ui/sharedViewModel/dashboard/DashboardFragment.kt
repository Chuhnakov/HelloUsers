package com.example.hellousers.ui.sharedViewModel.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hellousers.databinding.FragmentDashboardBinding
import com.example.hellousers.ui.sharedViewModel.SharedViewModel

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: SharedViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(SharedViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val image: ImageView = binding.circleImageView
        val txt_name: TextView = binding.textViewName
        val txt_email: TextView = binding.textViewEmail



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("MyLog", "Dash Fragment On Destroy")
        _binding = null
    }
}