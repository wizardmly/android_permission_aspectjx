package com.firefly1126.permissionaspect.demo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)
        findViewById<Button>(R.id.permission_btn)?.setOnClickListener { startActivity(Intent(this@MainActivity, PermissionActivity::class.java)) }
    }
}
