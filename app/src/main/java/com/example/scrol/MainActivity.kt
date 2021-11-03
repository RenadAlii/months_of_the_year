package com.example.scrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.scrol.adapter.ItemAdapter
import com.example.scrol.data.Datasource
import com.example.scrol.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    // Initialize data.
    val myDataset = Datasource().loadMonths()
    var recyclerView = binding.recyclerView.adapter
    recyclerView = ItemAdapter(this, myDataset)

    //needed to improve performance
    binding.recyclerView.setHasFixedSize(true)
}

}