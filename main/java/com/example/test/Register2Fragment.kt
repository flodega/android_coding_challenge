package com.example.test

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_register1.view.*
import kotlinx.android.synthetic.main.fragment_register1.view.button_name
import kotlinx.android.synthetic.main.fragment_register2.view.*

class Register2Fragment : Fragment() {

    var listener: onFragmentListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_register1, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {

        view.button_name.setOnClickListener {
            var house = view.edit_text_house.text.toString()
            var city = view.edit_text_city.text.toString()
            var country = view.edit_text_country.text.toString()

            listener?.onClick(house, city, country)

        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as MainActivity
    }


    interface onFragmentListener {
        fun onClick(house: String, city: String, country: String)


    }
}
