package com.example.goodwork.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.goodwork.Activity.EmpDetailsActivity
import com.example.goodwork.DataClass
import com.example.goodwork.R
import com.example.goodwork.adapters.ItemsAdapter
import com.example.goodwork.adapters.NewEmpAdapter
import com.example.goodwork.databinding.FragmentNewEmployeerBinding
import com.example.goodwork.listener.MyFragmentListener


class NewEmployeesFragment : Fragment() {

    private lateinit var binding : FragmentNewEmployeerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewEmployeerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivBack.setOnClickListener {
            activity?.onBackPressed()
        }
        setAdapters()
    }
    private fun setAdapters(){
        val itemList = ArrayList<DataClass>()
        itemList.add(DataClass("New", "15 Applications"))
        itemList.add(DataClass("Screening", "2 Application"))
        itemList.add(DataClass("Subimitted", "12 Application"))
        itemList.add(DataClass("Offered", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        binding.audioListRecyclear.layoutManager = LinearLayoutManager(context)
        var  adapterAudio = NewEmpAdapter(::onNewEmployeeItemClick)
        binding.audioListRecyclear.adapter = adapterAudio
    }
    private fun onNewEmployeeItemClick(){
//        startActivity(Intent(context,EmpDetailsActivity::class.java))
        findNavController().navigate(R.id.action_newEmployeesFragment_to_empDetailsFragment)
    }

}