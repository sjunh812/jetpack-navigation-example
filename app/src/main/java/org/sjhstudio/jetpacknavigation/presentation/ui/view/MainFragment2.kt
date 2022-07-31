package org.sjhstudio.jetpacknavigation.presentation.ui.view

import android.os.Bundle
import android.view.View
import org.sjhstudio.jetpacknavigation.R
import org.sjhstudio.jetpacknavigation.databinding.FragmentMain1Binding
import org.sjhstudio.jetpacknavigation.databinding.FragmentMain2Binding
import org.sjhstudio.jetpacknavigation.presentation.base.BaseFragment

class MainFragment2 : BaseFragment<FragmentMain2Binding>(R.layout.fragment_main_2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("xxx onViewCreated() : MainFragment2")
    }
}