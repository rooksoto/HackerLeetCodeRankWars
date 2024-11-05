package com.rooksoto.hackerleetcoderankwars.problems.codewars

class FindTheSmallestIntegerInTheArray : CodeWarsProblem<List<Int>, Int> {
    override val kyu: Int =
        8

    override val problemName: String =
        "Find the smallest integer in the array"

    override val problemDescription: String =
        """
        Given an array of integers your solution should find the smallest integer.

        For example:

        Given [34, 15, 88, 2] your solution will return 2
        Given [34, -345, -1, 100] your solution will return -345
        You can assume, for the purpose of this kata, that the supplied array will not be empty.
        """.trimIndent()

    override val testInput: List<Int> =
        listOf(34, 15, 88, 2)

    override val testSolution: Int =
        2

    override fun solve(input: List<Int>): Int = SmallestIntegerFinder().findSmallestInt(input)

    private class SmallestIntegerFinder {
        fun findSmallestInt(nums: List<Int>): Int = nums.reduce(::minOf)

        // Could have done this, but it's no fun.
        // fun findSmallestInt(nums: List<Int>): Int = nums.minOrNull() ?: 0
    }
}
