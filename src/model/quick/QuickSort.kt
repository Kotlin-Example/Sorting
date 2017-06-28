package model.quick

import model.AbstractSortInt

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 2:30 PM
 */
class QuickSort(collection: List<Int>) : AbstractSortInt(collection) {
    override fun algorithm() {
        if (collection.isEmpty()) return
        sort(0, collection.size - 1)
    }

    fun sort(low: Int, high: Int) {
        var i = low
        var j = high
        val pivot = get(low + (high - low) / 2)
        while (i <= j) {
            while (get(i) < pivot) {
                i++
            }
            while (get(j) > pivot) {
                j--
            }
            if (i <= j) {
                swap(i, j)
                i++
                j--
            }
        }
        if (low < j)
            sort(low, j)
        if (i < high)
            sort(i, high)
    }
}