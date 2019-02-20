package anikdas012.anikdas.tk.mvvm_try.utillities

import anikdas012.anikdas.tk.mvvm_try.data.FakeDatabase
import anikdas012.anikdas.tk.mvvm_try.data.QuoteRepository
import anikdas012.anikdas.tk.mvvm_try.ui.quotes.QuotesViewModelFactory

/**
 * Created by anikdas012 on 2/20/2019
 */
object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDAO)
        return QuotesViewModelFactory(quoteRepository)
    }
}