package com.buzzware.frenchconnectiondriver.fragments

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzzware.frenchconnectiondriver.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private val binding : FragmentProfileBinding by lazy {
        FragmentProfileBinding.inflate(layoutInflater)
    }

    private lateinit var fragmentContext: Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        setListener()

        return binding.root
    }

    private fun setListener() {

        binding.accountLayout.setOnClickListener {
            //startActivity(Intent(fragmentContext, EditProfileActivity::class.java))
            (fragmentContext as Activity).overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentContext = context
    }
}