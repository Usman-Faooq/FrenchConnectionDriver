package com.buzzware.frenchconnectiondriver.fragments

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzzware.frenchconnectiondriver.adapters.NewRideAdapter
import com.buzzware.frenchconnectiondriver.databinding.FragmentHomeBinding
import java.time.YearMonth
import java.time.format.DateTimeFormatter

class HomeFragment : Fragment() {

    private val binding : FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    private lateinit var fragmentContext : Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        setAdapter()

        return binding.root
    }

    private fun setAdapter() {
        binding.newRideRV.layoutManager = LinearLayoutManager(fragmentContext)
        binding.newRideRV.adapter = NewRideAdapter(fragmentContext, arrayListOf())
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentContext = context
    }

}