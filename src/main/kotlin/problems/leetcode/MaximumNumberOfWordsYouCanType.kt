package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class MaximumNumberOfWordsYouCanType : LeetCodeProblem<MaximumNumberOfWordsYouCanType.Params, Int> {
    override val id: Int =
        1935

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Maximum Number of Words You Can Type"

    override val problemDescription: String =
        """
        There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

        Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
        """.trimIndent()

    override val testInput: Params =
        Params(text = "hello world", brokenLetters = "ad")

    override val testSolution: Int =
        1

    override fun solve(input: Params): Int = Solution().canBeTypedWords(input.text, input.brokenLetters)

    private class Solution {
        fun canBeTypedWords(
            text: String,
            brokenLetters: String,
        ): Int = text.split(' ').count { word -> word.none(brokenLetters::contains) }
    }

    data class Params(
        val text: String,
        val brokenLetters: String,
    )
}
