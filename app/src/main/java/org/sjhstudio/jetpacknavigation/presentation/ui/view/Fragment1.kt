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
            btnNext.setOnClickListener {
                navController.navigate(R.id.action_fragment1_to_fragment2)
            }
        }
    }

}