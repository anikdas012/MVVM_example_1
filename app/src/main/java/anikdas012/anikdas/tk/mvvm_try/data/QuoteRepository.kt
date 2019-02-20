package anikdas012.anikdas.tk.mvvm_try.data

/**
 * Created by anikdas012 on 2/20/2019
 */
class QuoteRepository private constructor(private val quoteDAO: FakeQuoteDAO){

    fun addQuote(quote: Quote) {
        quoteDAO.addQuote(quote)
    }

    fun getQuotes() = quoteDAO.getQuote()


    companion object {
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(quoteDAO: FakeQuoteDAO) = instance ?: synchronized(this) {
            instance ?: QuoteRepository(quoteDAO).also { instance = it }
        }
    }
}