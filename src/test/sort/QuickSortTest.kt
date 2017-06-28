package test.sort

import test.sort.raw.SortTest

/**
 * @author kamontat
 * *
 * @version 1.0
 * *
 * @since Wed 28/Jun/2017 - 3:54 PM
 */
class QuickSortTest : SortTest() {
    override fun getSort(): raw.Sort<Int> {
        return model.quick.QuickSort(getCollection())
    }
}