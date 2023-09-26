package com.example.goodwork.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.goodwork.DataClass
import com.example.goodwork.databinding.ItemViewBinding
import com.example.goodwork.databinding.NewEmployeeItemBinding

class NewEmpAdapter(
    private val clickListenerCallback:() -> Unit
): RecyclerView.Adapter<NewEmpAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = NewEmployeeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return 7
    }

    inner class ViewHolder(private val binding: NewEmployeeItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind( position: Int) {
//            binding.tvTitle.text = item[position].name
//            binding.tvQuantity.text = item[position].title
            binding.root.setOnClickListener {
                clickListenerCallback()
            }
        }
    }
}
