package com.example.fragments2.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragments2.R
import com.example.fragments2.databinding.FragmentFifthBinding
import com.example.fragments2.databinding.FragmentSecondBinding
import com.example.fragments2.databinding.FragmentThirdBinding
import com.google.android.material.snackbar.Snackbar

class FifthFragment : Fragment() {
    private var _binding: FragmentFifthBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentFifthBinding.inflate(inflater,container,false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.fragment_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.refresh ->{
                Snackbar.make(binding.root,"REFRESH CLICKED",Snackbar.LENGTH_LONG).setBackgroundTint(Color.BLUE).show()
            }
            R.id.cancel ->{
                Snackbar.make(binding.root,"CANCEL CLICKED",Snackbar.LENGTH_LONG).setBackgroundTint(Color.RED).show()
            }
            R.id.check ->{
                Snackbar.make(binding.root,"CKECK CLICKED",Snackbar.LENGTH_LONG).setBackgroundTint(Color.GREEN).setTextColor(Color.BLACK).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}