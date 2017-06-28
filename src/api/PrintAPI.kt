package api

import java.util.*

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 1:07 PM
 */
object PrintAPI {
    fun array(c: Collection<Int>) {
        println(aToS(c))
    }

    fun array(title: String, c: Collection<Int>) {
        println("${title}: ${aToS(c)}")
    }

    /**
     * array -> string
     */
    private fun aToS(c: Collection<Int>): String {
        return Arrays.toString(c.toIntArray())
    }
}