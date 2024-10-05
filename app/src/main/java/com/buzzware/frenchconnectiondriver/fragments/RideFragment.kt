package com.buzzware.frenchconnectiondriver.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzzware.frenchconnectiondriver.R
import com.buzzware.frenchconnectiondriver.adapters.CompleteRideAdapter
import com.buzzware.frenchconnectiondriver.adapters.NewRideAdapter
import com.buzzware.frenchconnectiondriver.databinding.FragmentRideBinding

class RideFragment : Fragment() {

    private val binding : FragmentRideBinding by lazy {
        FragmentRideBinding.inflate(layoutInflater)
    }

    private lateinit var fragmentContext: Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        setListener()
        setRunningAdapter()

        return binding.root
    }

    private fun setListener() {


        binding.runningRide.setOnClickListener {
            binding.runningRide.setBackgroundResource(R.drawable.gradient_button)
            binding.completeRide.setBackgroundResource(0)

            setRunningAdapter()
        }

        binding.completeRide.setOnClickListener {
            binding.completeRide.setBackgroundResource(R.drawable.gradient_button)
            binding.runningRide.setBackgroundResource(0)

            setCompleteAdapter()
        }

    }

    private fun setRunningAdapter() {
        binding.rideRV.layoutManager = LinearLayoutManager(fragmentContext)
        binding.rideRV.adapter = NewRideAdapter(fragmentContext, arrayListOf())
    }

    private fun setCompleteAdapter() {
        binding.rideRV.layoutManager = LinearLayoutManager(fragmentContext)
        binding.rideRV.adapter = CompleteRideAdapter(fragmentContext, arrayListOf())
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentContext = context
    }

}