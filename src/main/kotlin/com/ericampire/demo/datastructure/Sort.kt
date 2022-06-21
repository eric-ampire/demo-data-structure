package com.ericampire.demo.datastructure


object Sort {

    /**
     * Bubble sort
     */
    object Bubble {
        fun bubbleSortV1(items: Array<Int>) {
            if (items.size == 1) return
            var unsortedPartitionIndex = items.size - 1

            while (unsortedPartitionIndex != 0) {
                for (index in 0..unsortedPartitionIndex) {
                    if (index == unsortedPartitionIndex) {
                        unsortedPartitionIndex--
                    } else if (items[index] > items[index + 1]) {
                        swap(items, index, index + 1)
                    }
                }
            }
        }

        fun bubbleSortV2(items: Array<Int>) {
            val lastIndex = items.size - 1
            for (lastUnsortedIndex in lastIndex downTo 0) {
                for (index in 0 until lastUnsortedIndex) {
                    if (items[index] > items[index + 1]) {
                        swap(items, index, index + 1)
                    }
                }
            }
        }
    }

    /**
     * Selection sort [2, 4, -2]
     *                 0  1   2
     */
    object Selection {
        fun selectionSortV1(items: Array<Int>) {
            val lastIndex = items.size - 1
            for (lastUnsortedIndex in lastIndex downTo 0) {
                var indexLargestItem = 0
                for (index in 1..lastUnsortedIndex) {
                    if (items[index] > items[indexLargestItem]) {
                        indexLargestItem = index
                    }
                }
                swap(items, lastUnsortedIndex, indexLargestItem)
            }
        }
    }

    object Insertion {
        fun insertionSortV1(items: Array<Int>) {
            for (firstUnsortedIndex in 1 until items.size) {
                var index = firstUnsortedIndex
                val newItem = items[firstUnsortedIndex]
                while (index > 0 && items[index - 1] > newItem) {
                    items[index] = items[index - 1]
                    index--
                }
                items[index] = newItem
            }
        }
    }

    private fun swap(items: Array<Int>, first: Int, second: Int) {
        if (first == second) return
        val temp = items[first]
        items[first] = items[second]
        items[second] = temp
    }
}