package anikdas012.anikdas.tk.mvvm_try.ui.quotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import anikdas012.anikdas.tk.mvvm_try.R
import anikdas012.anikdas.tk.mvvm_try.utillities.InjectorUtils

/**
 * Created by anikdas012 on 2/19/2019
 */
class QuotesActivity: AppCompatActivity() {

    private val LOG_TAG = "Main_Activity"
    private lateinit var textView_quote: AppCompatTextView
    private lateinit var button_add_quote: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "onCreate")
        setContentView(R.layout.activity_quotes)
        initializeUi()
    }

    private fun initializeUi() {
        textView_quote = findViewById(R.id.tv_quote)
        button_add_quote = findViewById(R.id.add_quote)
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
                .get(QuotesViewModel::class.java)

        viewModel.getQuotes().observe(this, Observer { quote ->
            val stringBuilder = StringBuilder()
            quote.forEach { quote ->
                stringBuilder.append("$quote\n\n")
            }
            textView_quote.text = stringBuilder.toString()
        })
    }
}