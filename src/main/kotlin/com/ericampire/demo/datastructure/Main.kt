package com.ericampire.demo.datastructure


fun main(args: Array<String>) {
    val data = arrayOf(-32, 1, -4, 5, 0, 0, 2, -50)
    data.forEach { print("$it, ") }
    Sort.Insertion.insertionSortV1(data)
    println()
    data.forEach { print("$it, ") }
}