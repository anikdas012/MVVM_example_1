package anikdas012.anikdas.tk.mvvm_try.data

/**
 * Created by anikdas012 on 2/19/2019
 */
class FakeDatabase private constructor(){

    var quoteDAO = FakeQuoteDAO()
    private set

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: FakeDatabase().also { instance = it }
        }
    }
}