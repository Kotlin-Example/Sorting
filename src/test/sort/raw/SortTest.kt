package test.sort.raw

import api.RandomCollection
import org.junit.Assert
import org.junit.Test
import raw.Sort
import test.api.TestApi
import test.constants.TestConstants
import java.util.concurrent.TimeUnit
import java.util.logging.Logger

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 3:27 PM
 */
abstract class SortTest {
    protected fun getCollection(): List<Int> {
        return RandomCollection.create(TestConstants.SIZE)
    }

    abstract fun getSort(): Sort<Int>

    @Test
    fun runTest() {
        Logger.getGlobal().info("start ${this.javaClass.name}.")

        val algo = getSort()

        Assert.assertTrue(TestApi.isSorted(algo.sorting()))

        TestApi.printTime(algo, TimeUnit.MILLISECONDS)
    }
}