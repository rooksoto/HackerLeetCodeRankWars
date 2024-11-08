package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class CountNegativeNumbersInASortedMatrix : LeetCodeProblem<Array<IntArray>, Int> {
    override val id: Int =
        1351

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Count Negative Numbers in a Sorted Matrix"

    override val problemDescription: String =
        """
        Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
        """.trimIndent()

    override val testInput: Array<IntArray> =
        arrayOf(
            intArrayOf(4, 3, 2, -1),
            intArrayOf(3, 2, 1, -1),
            intArrayOf(1, 1, -1, -2),
            intArrayOf(-1, -1, -2, -3),
        )

    override val testSolution: Int =
        8

    override fun solve(input: Array<IntArray>): Int = Solution().countNegatives(input)

    private class Solution {
        fun countNegatives(grid: Array<IntArray>): Int {
            // Nested loops
            var count = 0
            grid.forEach { row ->
                row.forEach { num ->
                    if (num < 0) count++
                }
            }
            return count
        }

        // Kotlin-flavored nested loops (note that intermediate results
        // inside the lambdas slightly increase space complexity)
        //
        // grid.sumOf { row ->
        //     row.count { num ->
        //         num < 0
        //     }
        // }
    }
}
