package model

import raw.Sort
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 10:08 AM
 */
abstract class AbstractSortInt(val collection: List<Int>) : Sort<Int> {
    private var mutable: MutableList<Int> = mutableListOf();

    private var time: Long = 0L
    private var interval: Long = 0L

    init {
        // Logger.getGlobal().info("start creating")
    }

    // constructor() : this(mutableListOf<Int>())

    override fun time(unit: TimeUnit): Long = unit.convert(interval, TimeUnit.NANOSECONDS)

    override fun time(): Long = interval

    override fun sorting(): Collection<Int> {
        // reset mutable
        mutable = ArrayList<Int>(collection)

        startTime()
        algorithm()
        stopTime()
        return getListReturnable()
    }

    override fun toString(): String {
        return Arrays.toString(collection.toTypedArray())
    }

    fun startTime() {
        time = System.nanoTime()
    }

    fun stopTime() {
        interval = System.nanoTime() - time
        time = 0L
    }

    /**
     * swap index i and j
     */
    protected fun swap(i: Int, j: Int) {
        val temp = get(i)
        set(i, get(j))
        set(j, temp)
    }

    protected fun get(index: Int): Int {
        return mutable.get(index)
    }

    protected fun set(index: Int, newE: Int) {
        mutable.set(index, newE)
    }

    protected fun getListReturnable(): Collection<Int> {
        return mutable
    }

    abstract fun algorithm()
}