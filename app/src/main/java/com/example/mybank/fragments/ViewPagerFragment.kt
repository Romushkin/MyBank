package com.example.mybank.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mybank.R
import com.example.mybank.StartActivity
import com.example.mybank.databinding.FragmentViewPagerBinding
import com.example.mybank.models.Picture

class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding
    private var check = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val viewPageItem = arguments?.getSerializable("vp") as Picture
        binding.viewPagerImageView.setImageResource(viewPageItem.imageView)
        check = viewPageItem.checkButton

        if (!check) {
            binding.viewPagerButtonBTN.visibility = View.VISIBLE
            binding.viewPagerButtonBTN.setOnClickListener {
                startActivity(Intent(activity, StartActivity::class.java))
            }
        }

        return binding.root
    }

}