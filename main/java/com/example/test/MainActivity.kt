package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity(), Register1Fragment.onFragmentInteraction, Register2Fragment.onFragmentListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, Register1Fragment())
            .commit()
    }

    override fun onClick(name: String, email: String, phone: String) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, Register2Fragment())
            .commit()

    }

    override fun onClick(name: String, email: String, phone: String, house: String, city: String, country: String) {

        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragment_container,
                SubmitFragment.newInstance(name, email, phone, house, city, country))
            .commit()

    }

    override fun onClick() {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, ThankFragment())
            .commit()
    }
}