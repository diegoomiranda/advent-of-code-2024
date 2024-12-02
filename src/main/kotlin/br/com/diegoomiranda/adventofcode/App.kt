package br.com.diegoomiranda.adventofcode

import day01part02
import day01partO1
import day01readInput

fun main() {
    val day01Input = day01readInput("day01")
    println("Day 1 part 1: ${day01partO1(day01Input.leftList, day01Input.rightList)}")
    println("Day 1 part 2: ${day01part02(day01Input.leftList, day01Input.rightList)}")
}