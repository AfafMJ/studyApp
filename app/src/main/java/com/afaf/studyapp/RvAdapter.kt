package com.afaf.studyapp


import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afaf.studyapp.databinding.ItemRowBinding

class RvAdapter(private val activity: Activity, private val items: ArrayList<ArrayList<String>>):
    RecyclerView.Adapter<RvAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.apply {
            tvTitle.text = items[position][0]
            tvInfo.text = items[position][1]
            cvCard.setOnClickListener {
                CustomAlert(
                    activity,
                    items[position][0],
                    items[position][2]
                )
            }
        }
    }

    override fun getItemCount() = items.size
}
