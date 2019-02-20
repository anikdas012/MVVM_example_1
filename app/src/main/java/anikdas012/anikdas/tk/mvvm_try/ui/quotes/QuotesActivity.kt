package anikdas012.anikdas.tk.mvvm_try.ui.quotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import anikdas012.anikdas.tk.mvvm_try.R
import anikdas012.anikdas.tk.mvvm_try.utillities.InjectorUtils

/**
 * Created by anikdas012 on 2/19/2019
 */
class QuotesActivity: AppCompatActivity() {

    private val LOG_TAG = "Main_Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "onCreate")
        setContentView(R.layout.activity_quotes)
        initializeUi()
    }

    private fun initializeUi() {
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
                .get(QuotesViewModel::class.java)
    }
}