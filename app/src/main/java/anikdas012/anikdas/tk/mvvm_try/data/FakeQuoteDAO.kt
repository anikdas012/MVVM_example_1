package anikdas012.anikdas.tk.mvvm_try.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Created by anikdas012 on 2/19/2019
 */
class FakeQuoteDAO {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    fun getQuote() = quotes as LiveData<List<Quote>>
}