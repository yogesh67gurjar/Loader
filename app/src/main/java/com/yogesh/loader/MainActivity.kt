package com.yogesh.loader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yogesh.loader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        MyLoader.showLoader(activityMainBinding.main, this)
    }
}