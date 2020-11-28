package com.example.bodeguin_wearable

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class ProductActivity : WearableActivity() {

    private lateinit var imCafe : ImageView
    private lateinit var imLeche : ImageView
    private lateinit var imPan : ImageView

    private lateinit var orderItem : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        imCafe = findViewById(R.id.cafe)
        imLeche = findViewById(R.id.leche)
        imPan = findViewById(R.id.pan)

        imCafe.setOnClickListener { view ->
            //val intent = Intent(this, OrderActivity::class.java)
            //intent.putExtra(EXTRA_MESSAGE, orderItem)
            //startActivity(intent)
        }

        imLeche.setOnClickListener { view ->
            //val intent = Intent(this, OrderActivity::class.java)
            //intent.putExtra(EXTRA_MESSAGE, orderItem)
            //startActivity(intent)
        }

        imPan.setOnClickListener { view ->
            //val intent = Intent(this, OrderActivity::class.java)
            //intent.putExtra(EXTRA_MESSAGE, orderItem)
            //startActivity(intent)
        }
    }

    fun showCafeOrder(view: View) {
        //orderItem = getString(R.string.cafe_item)
        //displayToast(orderItem)
    }

    fun showLecheOrder(view: View) {
        //orderItem = getString(R.string.leche_item)
        //displayToast(orderItem)
    }

    fun showPanOrder(view: View) {
        //orderItem = getString(R.string.pan_item)
        //displayToast(orderItem)
    }

    private fun displayToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    //companion object{
    //    val EXTRA_MESSAGE = "com.example.bodeguin_wearable.extra.MESSAGE";
    //}
}