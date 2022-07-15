package org.sjhstudio.jetpacknavigation.presentation.ui.view

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import org.sjhstudio.jetpacknavigation.R
import org.sjhstudio.jetpacknavigation.databinding.Fragment1Binding
import org.sjhstudio.jetpacknavigation.presentation.base.BaseFragment

class Fragment1 : BaseFragment<Fragment1Binding>(R.layout.fragment_1) {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initView()
    }

    private fun initView() {
        with(binding) {
            btnAllAgree.setOnClickListener {
                cb1.isChecked = true
                cb2.isChecked = true
                cb3.isChecked = true
            }
            btnNext.apply {
                isEnabled = false
                btnNext.setOnClickListener {
                    navController.navigate(R.id.action_fragment1_to_fragment2)
                }
            }
            cb1.setOnCheckedChangeListener { _, _ -> checkAllAgree() }
            cb2.setOnCheckedChangeListener { _, _ -> checkAllAgree() }
            cb3.setOnCheckedChangeListener { _, _ -> checkAllAgree() }
        }
    }

    private fun checkAllAgree(): Boolean {
        with(binding) {
            val allAgree = cb1.isChecked && cb2.isChecked && cb3.isChecked
            btnNext.isEnabled = allAgree
            return allAgree
        }
    }

}