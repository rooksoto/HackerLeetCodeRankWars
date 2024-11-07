package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class DuplicateZeros : LeetCodeProblem<IntArray, IntArray> {
    override val id: Int =
        1089

    override val problemName: String =
        "Duplicate Zeros"

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemDescription: String =
        """
        Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

        Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
        """.trimIndent()

    override val testInput: IntArray =
        intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)

    override val testSolution: IntArray =
        intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)

    override fun solve(input: IntArray): IntArray {
        Solution().duplicateZeros(input)
        return input
    }
}

private class Solution {
    fun duplicateZeros(arr: IntArray) {
        var currentIndex = 0
        // Iterate through the array, but stop before the last element to avoid a
        // bounds issue
        while (currentIndex < arr.lastIndex) {
            if (arr[currentIndex] == 0) {
                // Starting from the end, copy each element to the right
                arr.lastIndex.downTo(currentIndex + 1).forEach { index ->
                    // Include the current zero when copying
                    arr[index] = arr[index - 1]
                }

                // Skip over the newly copied zero to avoid duplicating it again
                currentIndex += 2
            } else {
                // Simply move to the next element if this one is not a zero
                currentIndex++
            }
        }
    }
}
