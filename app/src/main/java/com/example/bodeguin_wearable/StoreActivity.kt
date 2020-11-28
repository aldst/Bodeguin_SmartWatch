package com.example.bodeguin_wearable

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class StoreActivity : WearableActivity() {

    private lateinit var imBodega1 : ImageView
    private lateinit var imBodega2 : ImageView
    private lateinit var imBodega3 : ImageView

    private lateinit var BodegaItem : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        imBodega1 = findViewById(R.id.bodega1)
        imBodega2 = findViewById(R.id.bodega2)
        imBodega3 = findViewById(R.id.bodega3)

        imBodega1.setOnClickListener { view ->
            Log.d(this.toString(),BodegaItem)
            //displayToast(BodegaItem)
            //val intent = Intent(this, StoreDetailActivity::class.java)
            //intent.putExtra(EXTRA_MESSAGE, BodegaItem)
            //startActivity(intent)
        }

        imBodega2.setOnClickListener { view ->
            //val intent = Intent(this, StoreDetailActivity::class.java)
            //intent.putExtra(EXTRA_MESSAGE, BodegaItem)
            //startActivity(intent)
        }

        imBodega3.setOnClickListener { view ->
            //val intent = Intent(this, StoreDetailActivity::class.java)
            //intent.putExtra(EXTRA_MESSAGE, BodegaItem)
            //startActivity(intent)
        }
    }

    private fun displayToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun showBodega1(view: View) {
        //BodegaItem = getString(R.string.bodega1_name)
        //displayToast(BodegaItem)
    }

    fun showBodega2(view: View) {
        //BodegaItem = getString(R.string.bodega2_name)
        //displayToast(BodegaItem)
    }

    fun showBodega3(view: View) {
        //BodegaItem = getString(R.string.bodega3_name)
        //displayToast(BodegaItem)
    }

    companion object{
        val EXTRA_MESSAGE = "com.example.bodeguin_wearable.extra.MESSAGE";
    }
}