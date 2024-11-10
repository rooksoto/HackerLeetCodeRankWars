package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence : LeetCodeProblem<CheckIfAWordOccursAsAPrefixOfAnyWordInASentence.Params, Int> {
    override val id: Int =
        1455

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Check If a Word Occurs As a Prefix of Any Word in a Sentence"

    override val problemDescription: String =
        """
        Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

        Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

        A prefix of a string s is any leading contiguous substring of s.
        """.trimIndent()

    override val testInput: Params =
        Params(
            sentence = "i love eating burger",
            searchWord = "burg",
        )

    override val testSolution: Int =
        4

    override fun solve(input: Params): Int = Solution().isPrefixOfWord(input.sentence, input.searchWord)

    private class Solution {
        fun isPrefixOfWord(
            sentence: String,
            searchWord: String,
        ): Int =
            sentence
                .split(" ")
                .indexOfFirst { it.startsWith(searchWord) }
                .let { if (it == -1) it else it + 1 }
    }

    data class Params(
        val sentence: String,
        val searchWord: String,
    )
}
