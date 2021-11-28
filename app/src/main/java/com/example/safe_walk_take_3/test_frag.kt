package com.example.safe_walk_take_3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.safe_walk_take_3.databinding.ActivityTestFragBinding


class test_frag : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityTestFragBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTestFragBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val safe_walk_b = findViewById<Button>(R.id.safe_walk_b)
        safe_walk_b.setOnClickListener {
            val intent = Intent(this, find_safe_path::class.java)
            startActivity(intent)
        }

    }
}