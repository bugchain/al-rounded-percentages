import kotlin.math.floor

fun roundedPercentages(data: List<Double>): List<Int> {

    val floors = data.map { floor(it) }
    val sum = floors.sum()
    val diff = 100 - sum
    val sort = data.sortedByDescending { it - (floor(it)) }

    return sort.mapIndexed { index, d ->
        if (index < diff) d + 1 else d
    }.map { it.toInt() }

    /*

    val diff = 100 - (data.map { floor(it) }.sum())
    return data.sortedByDescending {
        it - (floor(it))
    }.mapIndexed { index, value ->
        if (index < diff) value + 1 else value
    }.map {
        floor(it)
    }.map {
        it.toInt()
    }

    */

}
