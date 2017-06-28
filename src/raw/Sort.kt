package raw

import java.util.concurrent.TimeUnit

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 10:01 AM
 */
interface Sort<T> {
    /**
     * start sorting
     */
    fun sorting(): Collection<T>

    /**
     * return in parameter unit
     */
    fun time(unit: TimeUnit): Long

    /**
     * return as nanosecond
     */
    fun time(): Long

    override fun toString(): String
}
