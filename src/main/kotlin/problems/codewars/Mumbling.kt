package com.rooksoto.hackerleetcoderankwars.problems.codewars

class Mumbling : CodeWarsProblem<String, String> {
    override val kyu: Int =
        7

    override val problemName: String =
        "Mumbling"

    override val problemDescription: String =
        """
        This time no story, no theory. The examples below show you how to write function accum:

        Examples:
        accum("abcd") -> "A-Bb-Ccc-Dddd"
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt") -> "C-Ww-Aaa-Tttt"
        
        The parameter of accum is a string which includes only letters from a..z and A..Z.
        """.trimIndent()

    override val testInput: String =
        "abcd"

    override val testSolution: String =
        "A-Bb-Ccc-Dddd"

    override fun solve(input: String): String = accum(input)

    private fun accum(s: String): String =
        s
            .mapIndexed { index, cur ->
                "${cur.uppercaseChar()}${cur.lowercase().repeat(index)}"
            }.joinToString("-")
}
