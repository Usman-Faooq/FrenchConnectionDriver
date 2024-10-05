package com.buzzware.frenchconnectiondriver.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzzware.frenchconnectiondriver.adapters.ChatAdapter
import com.buzzware.frenchconnectiondriver.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    private val binding : FragmentChatBinding by lazy {
        FragmentChatBinding.inflate(layoutInflater)
    }

    private lateinit var fragmentContext: Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        setChatAdapter()

        return binding.root
    }

    private fun setChatAdapter() {
        binding.chatRV.layoutManager = LinearLayoutManager(fragmentContext)
        binding.chatRV.adapter = ChatAdapter(fragmentContext, arrayListOf())
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentContext = context
    }
}