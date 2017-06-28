package test.api

import api.PrintAPI
import raw.Sort
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 2:59 PM
 */
object TestApi {
    /**
     * sort from less -> more
     */
    fun isSorted(arr: Array<kotlin.Int>): Boolean {
        var current = arr[0];
        for (int in arr) {
            if (current > int) return false
            else current = int
        }
        return true
    }

    /**
     * sort from less -> more
     */
    fun isSorted(arr: Collection<kotlin.Int>): Boolean {
        var current = arr.elementAt(0);
        arr.forEachIndexed(action = {
            index, i ->
            run {
                if (current > i) {
                    println(String.format(Locale.ENGLISH, "Error at %d -> %d", index - 1, index))
                    PrintAPI.array(arr)
                    return false
                } else current = i
            }
        })

        return true
    }


    fun printTime(sort: Sort<Int>) {
        println(String.format(Locale.ENGLISH, "time: %,d ns", sort.time()))
    }

    fun printTime(sort: Sort<Int>, unit: TimeUnit) {
        println(String.format(Locale.ENGLISH, "time: %,d %s", sort.time(unit), unit.name.toLowerCase(Locale.ENGLISH)))
    }
}