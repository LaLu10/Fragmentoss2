package com.example.fragments2.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.fragments2.R

class DialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater,container,savedInstanceState)
        dialog!!.setTitle("Dialog Fragment")
        return inflater.inflate(R.layout.fragment_dialog, container, false)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setMessage(R.string.Fragments)
            .setPositiveButton(R.string.Aceptar) { dialog, id ->
                Toast.makeText(this.context, "Has borrado datos", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton(R.string.Cancelar){ dialog, id ->
                Toast.makeText(this.context, "Has cancelado el borrado", Toast.LENGTH_SHORT).show()
            }
            .create()
    }
    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }
    }