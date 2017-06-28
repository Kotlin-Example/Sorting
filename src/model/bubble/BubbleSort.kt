package model.bubble

import model.AbstractSortInt

/**
 * @author kamontat
 * *
 * @version 1.0
 * *
 * @since Wed 28/Jun/2017 - 10:06 AM
 */
class BubbleSort(collection: List<Int>) : AbstractSortInt(collection) {

    override fun algorithm() {
        val size = collection.size
        for (i in 0..size - 1) {
            for (j in 1..size - i - 1) {
                if (get(j - 1) > get(j)) {
                    swap(j - 1, j)
                }
            }
        }
    }
}