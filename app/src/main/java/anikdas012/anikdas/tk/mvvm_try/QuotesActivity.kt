package anikdas012.anikdas.tk.mvvm_try

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by anikdas012 on 2/19/2019
 */
class QuotesActivity: AppCompatActivity() {

    private val LOG_TAG = "Main_Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "onCreate")
        setContentView(R.layout.activity_quotes)
    }
}