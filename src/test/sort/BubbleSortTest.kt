package test.sort

import test.sort.raw.SortTest

/**
 * @author kamontat
 * *
 * @version 1.0
 * *
 * @since Wed 28/Jun/2017 - 2:54 PM
 */
class BubbleSortTest : SortTest() {
    override fun getSort(): raw.Sort<Int> {
        return model.bubble.BubbleSort(collection = getCollection())
    }
}