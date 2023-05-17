package com.example.myapplicationiuyiui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var nametxt : EditText
    private lateinit var lnametxt : EditText
    private lateinit var gpatxt : EditText
    private lateinit var nextbtn : Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nametxt = view.findViewById(R.id.editTextTextPersonName)
        lnametxt = view.findViewById(R.id.editTextTextPersonName2)
        gpatxt = view.findViewById(R.id.editTextTextGPA)
        nextbtn = view.findViewById(R.id.button)

        nextbtn.setOnClickListener {


            val action = HomeFragmentDirections.actionHomeFragment2ToProfileFragment()

            findNavController().navigate(action)

     }
    }
}


//class HomeFragment : Fragment(R.layout.fragment_home) {
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        nextbtn.setOnClickListener {
//            val action = HomeFragmentDirections
//        }
//    }
//}