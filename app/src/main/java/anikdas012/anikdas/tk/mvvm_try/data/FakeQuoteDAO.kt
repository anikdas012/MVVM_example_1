package anikdas012.anikdas.tk.mvvm_try.data

import androidx.lifecycle.MutableLiveData

/**
 * Created by anikdas012 on 2/19/2019
 */
class FakeQuoteDAO {
    private val quoteList = mutableListOf<Quote>()
    private val quote = MutableLiveData<List<Quote>>()
}