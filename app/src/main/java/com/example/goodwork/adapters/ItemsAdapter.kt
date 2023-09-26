package com.example.goodwork.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.goodwork.DataClass
import com.example.goodwork.databinding.ItemViewBinding
import java.io.File

class ItemsAdapter(
    private val items: List<DataClass>,
    private val context: Context?,
//    private val clickListenerCallback:(List<DataClass>,Int) -> Unit
) :
    RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items,position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(private val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(audioItem: List<DataClass>,position: Int) {
            binding.tvTitle.text = audioItem[position].name
            binding.tvQuantity.text = audioItem[position].title
//            binding.root.setOnClickListener {
//                clickListenerCallback(audioItem, position)
//            }
        }
    }
}
