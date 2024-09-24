package com.example.aula5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import kotlin.math.log


class CadastroFragment : Fragment() {

    private lateinit var editNome:EditText
    private lateinit var btnEnviar :Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_cadastro, container, false)
        editNome = view.findViewById(R.id.EditNome)
        btnEnviar = view.findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener{
            val nome:String = editNome.text.toString()
            Log.i("texto", "$nome")
        }
        return view

    }

}