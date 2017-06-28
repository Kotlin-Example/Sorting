package model.merge

import model.AbstractSortInt

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 2:39 PM
 */
class MergeSort(collection: List<Int>) : AbstractSortInt(collection) {
    private var tempArr: Array<Int> = emptyArray<Int>()

    override fun algorithm() {
        if (collection.isEmpty()) return
        sort(0, collection.size - 1)
    }

    private fun sort(lowerIndex: Int, higherIndex: Int) {
        if (lowerIndex < higherIndex) {
            val middle = lowerIndex + (higherIndex - lowerIndex) / 2
            sort(lowerIndex, middle)
            sort(middle + 1, higherIndex)
            merge(lowerIndex, middle, higherIndex)
        }
    }

    private fun merge(lowerIndex: Int, middle: Int, higherIndex: Int) {
        tempArr = Array(collection.size, init = {
            i ->
            get(i)
        })
        var i = lowerIndex
        var j = middle + 1
        var k = lowerIndex
        while (i <= middle && j <= higherIndex) {
            if (tempArr[i] <= tempArr[j]) {
                set(k, tempArr[i])
                i++
            } else {
                set(k, tempArr[j])
                j++
            }
            k++
        }
        while (i <= middle) {
            set(k, tempArr[i])
            k++
            i++
        }

    }
}