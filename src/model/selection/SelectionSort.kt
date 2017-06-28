package model.selection

import model.AbstractSortInt

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 2:10 PM
 */
class SelectionSort(collection: List<Int>) : AbstractSortInt(collection) {
    override fun algorithm() {
        val size: Int = collection.size;
        for (i in 0..size - 1 - 1) {
            var index = i
            for (j in i + 1..size - 1)
                if (get(j) < get(index))
                    index = j
            swap(index, i)
        }
    }
}