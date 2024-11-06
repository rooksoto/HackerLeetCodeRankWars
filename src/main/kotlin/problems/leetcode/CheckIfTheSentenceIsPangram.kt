package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class CheckIfTheSentenceIsPangram : LeetCodeProblem<String, Boolean> {
    override val id: Int =
        1832

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Check if the Sentence Is Pangram"

    override val problemDescription: String =
        """
        A pangram is a sentence where every letter of the English alphabet appears at least once.

        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
        """.trimIndent()

    override val testInput: String =
        "thequickbrownfoxjumpsoverthelazydog"

    override val testSolution: Boolean =
        true

    override fun solve(input: String): Boolean = Solution().checkIfPangram(input)

    private class Solution {
        fun checkIfPangram(sentence: String): Boolean = sentence.toSet().size == 26
    }
}
