package anikdas012.anikdas.tk.mvvm_try.data

/**
 * Created by anikdas012 on 2/19/2019
 */
data class Quote(val quoteText: String, val author: String) {
    override fun toString(): String {
        return "$quoteText - $author"
    }
}