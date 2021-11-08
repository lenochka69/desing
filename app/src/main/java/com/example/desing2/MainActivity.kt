package com.example.desing2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.Toolbar

private const val TAG = "MainActivity"
private const val MY_FILTER_TAG = "ufilter"

class MainActivity : AppCompatActivity() {

  private lateinit var topAppBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)




        topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.favorite -> {
                    // Handle favorite icon press
                    true
                }
                R.id.search -> {
                    // Handle search icon press
                    true
                }
                R.id.more -> {
                    // Handle more item (inside overflow menu) press
                    true
                }
                else -> false
            }
        }
        Log.d(TAG,"onCreate")

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_nav_menu, menu)
        return true


    }





}



