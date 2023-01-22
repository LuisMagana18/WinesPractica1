package com.mgoc.winespractica1.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mgoc.winespractica1.databinding.WineElementBinding
import com.mgoc.winespractica1.model.Wine
import com.mgoc.winespractica1.view.activities.MainActivity

class WinesAdapter (private val context: Context, private val wines: ArrayList<Wine>): RecyclerView.Adapter<WinesAdapter.ViewHolder>() {
    class ViewHolder(view: WineElementBinding): RecyclerView.ViewHolder(view.root) {
        val ivThumbnail = view.ivThumbnail
        val tvTitle = view.tvTitle
        val tvTipo = view.tvTipo
        val tvAgeL = view.tvAgeL
        val tvScore = view.tvScore
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = WineElementBinding.inflate(LayoutInflater.from(context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = wines[position].name

        Glide.with(context)
            .load(wines[position].thumbnail)
            .into(holder.ivThumbnail)

        holder.tvTipo.text = wines[position].type
        holder.tvAgeL.text = wines[position].age
        holder.tvScore.text = "Score: ${wines[position].score}/5"

        //Para los clicks
        holder.itemView.setOnClickListener{
            if(context is MainActivity) context.selectedWine(wines[position])
        }
    }

    override fun getItemCount(): Int = wines.size
}