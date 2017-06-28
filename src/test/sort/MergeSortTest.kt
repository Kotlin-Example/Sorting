package test.sort

import model.merge.MergeSort
import raw.Sort
import test.sort.raw.SortTest

/**
 * @author kamontat
 * *
 * @version 1.0
 * *
 * @since Wed 28/Jun/2017 - 3:41 PM
 */
class MergeSortTest : SortTest() {
    override fun getSort(): Sort<Int> {
        return MergeSort(getCollection())
    }
}