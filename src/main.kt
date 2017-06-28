import api.RandomCollection
import model.AbstractSortInt
import model.bubble.BubbleSort
import model.selection.SelectionSort

/**
 * @author kamontat
 * @version 1.0
 * @since Wed 28/Jun/2017 - 1:08 PM
 */
fun main(args: Array<String>) {
    val SIZE = 10
    val c = RandomCollection.create(SIZE)

    var algorithm: AbstractSortInt = BubbleSort(c);
    algorithm.sorting()
    println("time: ${algorithm.time()}")

    algorithm.sorting()
    println("time: ${algorithm.time()}")


    algorithm = SelectionSort(c);
    algorithm.sorting()
    println("time: ${algorithm.time()}")
}