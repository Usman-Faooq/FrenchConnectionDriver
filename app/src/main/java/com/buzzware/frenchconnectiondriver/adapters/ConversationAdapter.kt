package com.buzzware.frenchconnectiondriver.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzzware.frenchconnectiondriver.databinding.ItemDesignConversationLayoutBinding
import java.util.*
import kotlin.collections.ArrayList

class ConversationAdapter(val context : Context, val list: ArrayList<String>) :
    RecyclerView.Adapter<ConversationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemDesignConversationLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (position == 1){
            holder.binding.senderLayout.root.visibility = View.VISIBLE
            holder.binding.reciverLayout.root.visibility = View.GONE

        }else{
            holder.binding.senderLayout.root.visibility = View.GONE
            holder.binding.reciverLayout.root.visibility = View.VISIBLE

        }
    }

    inner class ViewHolder(val binding : ItemDesignConversationLayoutBinding) : RecyclerView.ViewHolder(binding.root)

}
