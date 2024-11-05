package com.rooksoto.hackerleetcoderankwars.problems.codewars

class ReversedSequence : CodeWarsProblem<Int, List<Int>> {
    override val kyu: Int =
        8
    override val problemName: String =
        "Reversed sequence"

    override val problemDescription: String =
        """
        Build a function that returns an array of integers from n to 1 where n>0.
        """.trimIndent()

    override val testInput: Int =
        5

    override val testSolution: List<Int> =
        listOf(5, 4, 3, 2, 1)

    override fun solve(input: Int): List<Int> = reverseSeq(input)

    // region Solution

    private fun reverseSeq(n: Int): List<Int> = (n downTo 1).toList()

    // endregion
}
