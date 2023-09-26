package com.example.goodwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.goodwork.databinding.ActivityMainBinding
import com.example.goodwork.fragment.EmpDetailsFragment
import com.example.goodwork.fragment.NewEmployeesFragment
import com.example.goodwork.listener.MyFragmentListener

class MainActivity : AppCompatActivity(), MyFragmentListener {
    private lateinit var binding : ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        window.statusBarColor = getColor(R.color.bg_color)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        onClickBottomIcons()
        binding.view1.visibility = View.INVISIBLE
        binding.view2.visibility = View.INVISIBLE
        binding.view3.visibility = View.INVISIBLE
        binding.view4.visibility = View.INVISIBLE
    }

    private fun onClickBottomIcons(){
        binding.llStairs.setOnClickListener {
            binding.ivSearch.setImageResource(R.drawable.search)
            binding.ivHome.setImageResource(R.drawable.home_icons)
            binding.view2.visibility = View.VISIBLE
            binding.view1.visibility = View.INVISIBLE

            navController.navigate(R.id.exploreEmployeesFragment)
        }
        binding.llAdvanced.setOnClickListener {
            binding.view1.visibility = View.VISIBLE
            binding.view2.visibility = View.INVISIBLE

            navController.navigate(R.id.homeFragment)
        }
    }

    override fun onDataReceived() {
        binding.bottomView.visibility = View.GONE
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val fragmentManager = supportFragmentManager
        val fragment = fragmentManager.findFragmentById(R.id.newEmployeesFragment)
//        val fragment1 = fragmentManager.findFragmentById(R.id.empDetailsFragment)

        if (fragment is NewEmployeesFragment ) {
            binding.bottomView.visibility = View.GONE
        }/*else if(fragment1 is EmpDetailsFragment) {
            binding.bottomView.visibility = View.GONE
        } */else{
            binding.bottomView.visibility = View.VISIBLE
        }
    }

}