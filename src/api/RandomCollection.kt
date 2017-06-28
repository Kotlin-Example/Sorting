package api

import java.util.*
import kotlin.collections.ArrayList
import java.util.Calendar as CC

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 11:25 AM
 */
object RandomCollection {
    private var LENGTH: Int = 500_000
    fun setLength(length: Int) {
        this.LENGTH = length
    }


    fun create(size: Int): List<Int> {
        val collection = ArrayList<Int>(size)
        for (i in 1..size) {
            collection.add(random())
        }
        return collection
    }

    fun createToArray(size: Int): IntArray {
        return this.create(size).toIntArray()
    }

    private fun random(): Int {
        return Random(System.nanoTime()).nextInt(LENGTH) + 1
    }
}