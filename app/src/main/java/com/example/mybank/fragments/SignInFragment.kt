package com.example.mybank.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.mybank.R
import com.example.mybank.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSignInBinding.inflate(inflater,container,false)

        val name = arguments?.getString("name")
        val password = arguments?.getString("password")

        binding.loginSignInButton.setOnClickListener{
            if (name != binding.userNameSignInEditTextET.text.toString() ||
                password != binding.passwordSignInEditTextET.text.toString()){
                Toast.makeText(context, "Введены неверно пароль или логин",
                    Toast.LENGTH_LONG).show()
                return@setOnClickListener
            } else {
                fragmentManager?.beginTransaction()?.replace(R.id.containerID, MainFragment())?.commit()
            }
        }
        return binding.root
    }
}