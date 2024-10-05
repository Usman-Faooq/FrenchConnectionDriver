package com.buzzware.frenchconnectiondriver.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzzware.frenchconnectiondriver.R
import com.buzzware.frenchconnectiondriver.adapters.ConversationAdapter
import com.buzzware.frenchconnectiondriver.databinding.ActivityConversationBinding

class ConversationActivity : AppCompatActivity() {

    private val binding : ActivityConversationBinding by lazy {
        ActivityConversationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setAdapter()
        setListener()

    }

    private fun setAdapter() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)
        binding.recyclerView.adapter = ConversationAdapter(this, arrayListOf())
    }

    private fun setListener() {

        binding.backIV.setOnClickListener { onBackPressed() }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
    }

}