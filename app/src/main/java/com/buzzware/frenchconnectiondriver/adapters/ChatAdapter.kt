package com.buzzware.frenchconnectiondriver.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzzware.frenchconnectiondriver.activities.ConversationActivity
import com.buzzware.frenchconnectiondriver.databinding.ItemDesignChatLayoutBinding

class ChatAdapter(val context: Context, list: ArrayList<String>)
    :RecyclerView.Adapter<ChatAdapter.ViewHolder>(){


    inner class ViewHolder(val binding : ItemDesignChatLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemDesignChatLayoutBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.root.setOnClickListener {
            context.startActivity(Intent(context, ConversationActivity::class.java))
            (context as Activity).overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
        }

    }
}