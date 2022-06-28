package com.example.fragments2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments2.databinding.FragmentForthBinding
import com.example.fragments2.databinding.FragmentSecondBinding
import com.example.fragments2.databinding.FragmentThirdBinding


class ForthFragment : Fragment() {
    private var _binding: FragmentForthBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentForthBinding.inflate(inflater,container,false)

        // Inflate the layout for this fragment
        return binding.root
    }
}