package com.example.goodwork.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.goodwork.R
import com.example.goodwork.databinding.FragmentEmpDetailsBinding
import com.example.goodwork.listener.MyFragmentListener


class EmpDetailsFragment : Fragment() {
    private lateinit var binding : FragmentEmpDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEmpDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivBack.setOnClickListener {
           activity?.onBackPressed()
        }
    }



}