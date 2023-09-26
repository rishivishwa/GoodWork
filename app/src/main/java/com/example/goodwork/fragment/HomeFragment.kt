package com.example.goodwork.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.goodwork.DataClass
import com.example.goodwork.R
import com.example.goodwork.Utils
import com.example.goodwork.adapters.ItemsAdapter
import com.example.goodwork.databinding.ActivityMainBinding
import com.example.goodwork.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textTitle = getString(R.string.help_your_applicants_advance)
        val spanable = Utils.changeTextColorInSentence(textTitle,"applicants advance!",context?.getColor(R.color.text_heighlight)!!)
        binding.profileText.text = spanable

        val itemList = ArrayList<DataClass>()
        itemList.add(DataClass("New", "15 Applications"))
        itemList.add(DataClass("Screening", "2 Application"))
        itemList.add(DataClass("Subimitted", "12 Application"))
        itemList.add(DataClass("Offered", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        binding.audioListRecyclear.layoutManager =LinearLayoutManager(context)
        var  adapterAudio = ItemsAdapter(itemList, context)
        binding.audioListRecyclear.adapter = adapterAudio

    }






}