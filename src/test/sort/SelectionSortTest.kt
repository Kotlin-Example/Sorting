package test.sort

import test.sort.raw.SortTest

/**
 * @author kamontat
 * *
 * @version 1.0
 * *
 * @since Wed 28/Jun/2017 - 3:57 PM
 */
class SelectionSortTest : SortTest() {
    override fun getSort(): raw.Sort<Int> {
        return model.selection.SelectionSort(getCollection())
    }
}