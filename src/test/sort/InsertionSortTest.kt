package test.sort

import test.sort.raw.SortTest

/**
 * @author kamontat
 * *
 * @version 1.0
 * *
 * @since Wed 28/Jun/2017 - 3:34 PM
 */
class InsertionSortTest : SortTest() {
    override fun getSort(): raw.Sort<Int> {
        return model.insertion.InsertionSort(getCollection())
    }
}