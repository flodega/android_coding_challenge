package com.example.test

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_submit.view.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 ="param2"
private const val ARG_PARAM3 = "param3"
private const val ARG_PARAM4 ="param4"
private const val ARG_PARAM5 = "param5"
private const val ARG_PARAM6 ="param6"


class SubmitFragment : Fragment() {

    private var name: String? = null
    private var email: String? = null
    private var phone: String? = null
    private var house: String? = null
    private var city: String? = null
    private var country: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(ARG_PARAM1)
            email = it.getString(ARG_PARAM2)
            phone = it.getString(ARG_PARAM3)
            house = it.getString(ARG_PARAM4)
            city = it.getString(ARG_PARAM5)
            country= it.getString(ARG_PARAM6)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_submit, container, false)
        init(view)
        return view

    }

    private fun init(view: View) {
        view.text_view_name.text = name
        view.text_view_email.text = email
        view.text_view_phone.text = phone
        view.text_view_house.text = house
        view.text_view_city.text = city
        view.text_view_country.text = country

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String, param3: String, param4: String, param5: String, param6: String) =
            SubmitFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    putString(ARG_PARAM3, param3)
                    putString(ARG_PARAM4, param4)
                    putString(ARG_PARAM5, param5)
                    putString(ARG_PARAM6, param6)

                }
            }
    }


}