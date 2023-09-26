package com.example.goodwork.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.goodwork.DataClass
import com.example.goodwork.R
import com.example.goodwork.Utils
import com.example.goodwork.adapters.ItemsAdapter
import com.example.goodwork.adapters.NewEmployeeItemAdapter
import com.example.goodwork.databinding.FragmentExploreEmployeesBinding
import com.example.goodwork.listener.MyFragmentListener


class ExploreEmployeesFragment : Fragment() {

    private lateinit var binding : FragmentExploreEmployeesBinding
    private var listener: MyFragmentListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentExploreEmployeesBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textTitle = "Explore your employees status!"
        val spanable = Utils.changeTextColorInSentence(textTitle,"employees status!",context?.getColor(R.color.text_heighlight)!!)
        binding.profileText.text = spanable
        setAdapters()
    }
    private fun setAdapters(){
        val itemList = ArrayList<DataClass>()
        itemList.add(DataClass("New", "15 Applications"))
        itemList.add(DataClass("Screening", "2 Application"))
        itemList.add(DataClass("Subimitted", "12 Application"))
        itemList.add(DataClass("Offered", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        itemList.add(DataClass("Onboarding", "15 Application"))
        binding.audioListRecyclear.layoutManager = LinearLayoutManager(context)
        var adapterAudio = NewEmployeeItemAdapter(itemList, context,::onItemClick)
        binding.audioListRecyclear.adapter = adapterAudio
    }
    private fun onItemClick(itemInfo: List<DataClass>,position: Int){
        listener?.onDataReceived()
        findNavController().navigate(R.id.action_exploreEmployeesFragment_to_newEmployeesFragment)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MyFragmentListener) {
            listener = context
        } else {
            throw ClassCastException("$context must implement MyFragmentListener")
        }
    }

}