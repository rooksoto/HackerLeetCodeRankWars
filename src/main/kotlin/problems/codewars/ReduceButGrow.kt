package com.rooksoto.hackerleetcoderankwars.problems.codewars

class ReduceButGrow : CodeWarsProblem<IntArray, Int> {
    override val kyu: Int =
        8

    override val problemName: String =
        "Reduce but Grow"

    override val problemDescription: String =
        """
        Given a non-empty array of integers, return the result of multiplying the values together in order.
        """.trimIndent()

    override val testInput: IntArray =
        intArrayOf(1, 2, 3, 4)

    override val testSolution: Int =
        24

    override fun solve(input: IntArray): Int = grow(input)

    // region Solution

    private fun grow(arr: IntArray): Int =
        arr.reduce { acc, i ->
            acc * i
        }

    // endregion
}
