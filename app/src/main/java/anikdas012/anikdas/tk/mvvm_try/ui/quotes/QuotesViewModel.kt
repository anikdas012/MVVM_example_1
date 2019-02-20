package anikdas012.anikdas.tk.mvvm_try.ui.quotes

import androidx.lifecycle.ViewModel
import anikdas012.anikdas.tk.mvvm_try.data.Quote
import anikdas012.anikdas.tk.mvvm_try.data.QuoteRepository

/**
 * Created by anikdas012 on 2/20/2019
 */
class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}