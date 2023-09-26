package com.example.goodwork.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.goodwork.R
import com.example.goodwork.databinding.ActivityEmpDetailsBinding
import com.example.goodwork.databinding.ActivityMainBinding
import com.example.goodwork.databinding.FragmentEmpDetailsBinding

class EmpDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmpDetailsBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmpDetailsBinding.inflate(layoutInflater)
        window.statusBarColor = getColor(R.color.bg_color)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment
        navController = navHostFragment.navController
        navController.navigate(R.id.empDetailsFragment)

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        navController = navHostFragment.navController
    }
}