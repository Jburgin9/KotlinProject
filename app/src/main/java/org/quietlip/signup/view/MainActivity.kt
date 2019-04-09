package org.quietlip.signup.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.quietlip.signup.DataService
import org.quietlip.signup.R
import org.quietlip.signup.model.Category

class MainActivity : AppCompatActivity() {
    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        list_view.adapter = adapter

    }
}
