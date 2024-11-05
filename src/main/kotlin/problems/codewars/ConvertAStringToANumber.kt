package com.rooksoto.hackerleetcoderankwars.problems.codewars

class ConvertAStringToANumber : CodeWarsProblem<String, Int> {
    override val kyu: Int =
        8

    override val problemName: String =
        "Convert a String to a Number!"

    override val problemDescription: String =
        """
        We need a function that can transform a string into a number. What ways of achieving this do you know?

        Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
        """.trimIndent()

    override val testInput: String =
        "-7"
    override val testSolution: Int =
        -7

    override fun solve(input: String): Int = stringToNumber(input)

    // region Solution

    private fun stringToNumber(str: String): Int = str.toInt()

    // endregion
}
