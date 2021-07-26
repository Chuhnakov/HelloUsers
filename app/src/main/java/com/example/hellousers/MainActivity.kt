package com.example.hellousers

import android.os.Bundle
import android.util.Log
import android.app.AlertDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hellousers.data.common.Common
import com.example.hellousers.data.retrofit.RetrofitServices
import com.example.hellousers.databinding.ActivityMainBinding
import dmax.dialog.SpotsDialog

class MainActivity : AppCompatActivity() {

    lateinit var dialog: AlertDialog

    private lateinit var mService: RetrofitServices
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        mService = Common.retrofitService
        dialog = SpotsDialog.Builder().setContext(this).build()


    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyMainActivity","On Destroy")
    }
}