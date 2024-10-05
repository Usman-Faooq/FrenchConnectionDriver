package com.buzzware.frenchconnectiondriver.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzzware.frenchconnectiondriver.activities.ConversationActivity
import com.buzzware.frenchconnectiondriver.databinding.ItemDesignChatLayoutBinding
import com.buzzware.frenchconnectiondriver.databinding.ItemDesignRideLayoutBinding

class CompleteRideAdapter(val context: Context, list: ArrayList<String>)
    :RecyclerView.Adapter<CompleteRideAdapter.ViewHolder>(){


    inner class ViewHolder(val binding : ItemDesignRideLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemDesignRideLayoutBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       /* holder.binding.root.setOnClickListener {
            context.startActivity(Intent(context, ConversationActivity::class.java))
            (context as Activity).overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
        }*/

    }
}