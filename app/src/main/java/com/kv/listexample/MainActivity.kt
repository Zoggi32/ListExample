package com.kv.listexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kv.listexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listString = arrayListOf("item1", "item2", "item3")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listString)

        binding.list.adapter = adapter
        binding.list.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "$i : $l", Toast.LENGTH_LONG).show()
        }
    }
}