package com.rooksoto.hackerleetcoderankwars.problems.codewars

class InvertValues : CodeWarsProblem<IntArray, IntArray> {
    override val kyu: Int =
        8

    override val problemName: String =
        "Invert values"

    override val problemDescription: String =
        """
            Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
        """.trimIndent()

    override val testInput: IntArray =
        intArrayOf(1, -2, 3, -4, 5)
    override val testSolution: IntArray =
        intArrayOf(-1, 2, -3, 4, -5)

    override fun solve(input: IntArray): IntArray =
        invert(input)

    // region Solution

    private fun invert(arr: IntArray): IntArray =
        arr.map { -it }.toIntArray()

    // endregion
}
