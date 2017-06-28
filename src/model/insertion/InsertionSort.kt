package model.insertion

import model.AbstractSortInt


/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 2:22 PM
 */
class InsertionSort(collection: List<Int>) : AbstractSortInt(collection) {
    override fun algorithm() {
        val size: Int = collection.size
        for (i in 1..size - 1) {
            for (j in i downTo 1) {
                if (get(j) < get(j - 1)) {
                    swap(j, j - 1)
                }
            }
        }
    }
}