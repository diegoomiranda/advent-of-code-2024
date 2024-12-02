package br.com.diegoomiranda.adventofcode

import day01part02
import day01partO1
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ChallengeTests {

    @Test
    fun part01Test() {
        val leftList = listOf(3, 4, 2, 1, 3, 3)
        val rightList = listOf(4, 3, 5, 3, 9, 3)

        assertEquals(11, day01partO1(leftList, rightList))
    }

    @Test
    fun part02test() {
        val leftList = listOf(3, 4, 2, 1, 3, 3)
        val rightList = listOf(4, 3, 5, 3, 9, 3)

        assertEquals(31, day01part02(leftList, rightList))
    }
}