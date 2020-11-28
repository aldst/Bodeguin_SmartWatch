package com.example.bodeguin_wearable

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.NotificationCompat

class MainActivity : WearableActivity() {

    private val idLocation = "my_location_channel"

    private lateinit var store_list : ImageView
    private lateinit var product_list : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        store_list = findViewById(R.id.store_image)
        product_list = findViewById(R.id.product_image)

        store_list.setOnClickListener { view ->
            val intent = Intent(this, StoreActivity::class.java)
            startActivity(intent)
        }

        product_list.setOnClickListener { view ->
            val intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
        }

        //Navigation
        val locationBuilder = NotificationCompat.Builder(this, idLocation)
            .setSmallIcon(android.R.drawable.ic_menu_mylocation)

        // Enables Always-on
        setAmbientEnabled()
    }
}