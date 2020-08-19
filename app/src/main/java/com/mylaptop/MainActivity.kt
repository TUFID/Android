package com.mylaptop

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvLaptop: RecyclerView
    private var list: ArrayList<Laptop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "MyLaptop"

        rvLaptop = findViewById(R.id.rv_laptop)
        rvLaptop.setHasFixedSize(true)

        list.addAll(LaptopData.listData)
        showRecyclerList()
    }


    private fun showRecyclerList() {
        rvLaptop.layoutManager = LinearLayoutManager(this)
        val listLaptopAdapter = ListLaptopAdapter(list)
        rvLaptop.adapter = listLaptopAdapter
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_grid -> {
                val gridLaptopAdapter = Intent(this@MainActivity, GridLaptopAdapter::class.java)
                startActivity(gridLaptopAdapter)
            }


            R.id.about -> {
                val about = Intent(this@MainActivity, About::class.java)
                startActivity(about)
            }

        }
    }
}
