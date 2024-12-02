import kotlin.math.abs

data class ChallengeOneInput(val leftList: List<Int>, val rightList: List<Int>)

fun day01readInput(fileName: String) : ChallengeOneInput {
    val leftList = ArrayList<Int>()
    val rightList = ArrayList<Int>();

    {}.javaClass.getResourceAsStream(fileName)
        ?.reader()
        ?.forEachLine {
            val value = it.split(" ")
            leftList.add(value[0].toInt())
            rightList.add(value[1].toInt())
        }
    return ChallengeOneInput(leftList, rightList)
}

fun day01partO1(leftList: List<Int>, rightList: List<Int>) : Int {
    return part01DumbSolution(leftList, rightList)
}

private fun part01DumbSolution(leftList: List<Int>, rightList: List<Int>) : Int {
    val sortedLeftList = leftList.sorted()
    val sortedRightList = rightList.sorted()
    var sum = 0

    for(index in sortedLeftList.indices){
        sum += abs(sortedRightList[index] - sortedLeftList[index])
    }

    return sum
}

private fun part01lessDumbSolution(leftList: List<Int>, rightList: List<Int>) : Int {
    // both lists have the same length, so iterate over it order and compare as you go, when a position is updated
    // also update the distances

    return 0
}

fun day01part02(leftList: List<Int>, rightList: List<Int>) : Int {
    return part02DumbSolution(leftList, rightList)
}

fun part02DumbSolution(leftList: List<Int>, rightList: List<Int>): Int {
    return leftList.sumOf { leftValue -> leftValue * rightList.filter { it == leftValue }.size }
}

fun part02LessDumbSolution(leftList: List<Int>, rightList: List<Int>): Int {
    // again, both lists have the same length, so iterate once and have a map to store how many times a value from the
    // first list is in the second
    return 0
}
