package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class ElementAppearingMoreThan25PercentInSortedArray : LeetCodeProblem<IntArray, Int> {
    override val id: Int =
        1287

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Element Appearing More Than 25% In Sorted Array"

    override val problemDescription: String =
        """
        Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
        """.trimIndent()

    override val testInput: IntArray =
        intArrayOf(1, 2, 2, 6, 6, 6, 6, 7, 10)

    override val testSolution: Int =
        6

    override fun solve(input: IntArray): Int = Solution().findSpecialInteger(input)

    private class Solution {
        // Group the Ints into a Map of <Int, List<Int>>, where the key is the
        // Int itself, and the value is a list of each occurrence of the Int
        // Given the rules, only one number will occur more than 25% of the time,
        // so we can assume it's the one with the most occurrences
        fun findSpecialInteger(arr: IntArray): Int = arr.groupBy { it }.maxBy { it.value.size }.key
    }
}
