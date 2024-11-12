package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class CheckIfWordEqualsSummationOfTwoWords : LeetCodeProblem<CheckIfWordEqualsSummationOfTwoWords.Params, Boolean> {
    override val id: Int =
        1880

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Check if Word Equals Summation of Two Words"

    override val problemDescription: String =
        """
        The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).

        The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

        For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.
        You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.

        Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.
        """.trimIndent()

    override val testInput: Params =
        Params(
            firstWord = "acb",
            secondWord = "cba",
            targetWord = "cdb",
        )

    override val testSolution: Boolean =
        true

    override fun solve(input: Params): Boolean = Solution().isSumEqual(input.firstWord, input.secondWord, input.targetWord)

    private class Solution {
        fun isSumEqual(
            firstWord: String,
            secondWord: String,
            targetWord: String,
        ): Boolean = firstWord.summate() + secondWord.summate() == targetWord.summate()

        private fun String.summate() =
            map { it.code - 97 }
                .joinToString(separator = "")
                .toInt()
    }

    data class Params(
        val firstWord: String,
        val secondWord: String,
        val targetWord: String,
    )
}
