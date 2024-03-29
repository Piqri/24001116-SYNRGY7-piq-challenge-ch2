package com.example.challenge_ch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appName = getString(R.string.app_name)
        val costOfService = getString(R.string.cost_of_service)
        val howWasTheService = getString(R.string.how_was_the_service)
        val amazingService = getString(R.string.amazing_service)
        val goodService = getString(R.string.good_service)
        val okService = getString(R.string.ok_service)
        val roundUpTip = getString(R.string.round_up_tip)
        val calculate = getString(R.string.calculate)
        val tipAmount = getString(R.string.tip_amount)
        val totalAmount = getString(R.string.total_amount)

    }
}
