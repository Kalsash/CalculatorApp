package com.example.mycalc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mycalc.R
import com.example.mycalc.databinding.ActivityMainBinding
import com.example.mycalc.viewmodel.Calculator
import com.example.mycalc.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding : ActivityMainBinding
    private lateinit var viewModel: Calculator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = CalculatorViewModel()

        mainBinding.viewModel = viewModel
    }
}