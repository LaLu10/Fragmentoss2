package com.example.fragments2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fragments2.databinding.ActivityMain2Binding
import com.example.fragments2.fragments.DialogFragment
import com.example.fragments2.fragments.FifthFragment
import com.example.fragments2.fragments.ForthFragment
import com.example.fragments2.fragments.ThirdFragment

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment3 = ThirdFragment()
        val fragment4 = ForthFragment()
        val fragment5 = FifthFragment()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFrag3.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .setCustomAnimations(
                    R.anim.fade_in,
                    R.anim.fade_out,
                    R.anim.slide_in,
                    R.anim.slide_out
                )
                .replace(R.id.fragmentContainer, fragment3)
                .commit()
        }
        binding.btnFrag4.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .setCustomAnimations(
                    R.anim.fade_in,
                    R.anim.fade_out,
                    R.anim.slide_in,
                    R.anim.slide_out
                )
                .replace(R.id.fragmentContainer, fragment4)
                .commit()
        }
        binding.btnFrag5.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .setCustomAnimations(
                    R.anim.fade_in,
                    R.anim.fade_out,
                    R.anim.slide_in,
                    R.anim.slide_out
                )
                .replace(R.id.fragmentContainer, fragment5)
                .commit()
        }
        binding.btnVolver.setOnClickListener {
            onBackPressed()
        }

        }
    fun onClickDialog(view: View) {
        DialogFragment().show(supportFragmentManager, DialogFragment.TAG)
    }
}


