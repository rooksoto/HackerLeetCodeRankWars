package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class DeleteCharactersToMakeFancyString : LeetCodeProblem<String, String> {
    override val id: Int =
        1957

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Delete Characters to Make Fancy String"

    override val problemDescription: String =
        """
        A fancy string is a string where no three consecutive characters are equal.

        Given a string s, delete the minimum possible number of characters from s to make it fancy.

        Return the final string after the deletion. It can be shown that the answer will always be unique.
        """.trimIndent()

    override val testInput: String =
        "leeetcode"

    override val testSolution: String =
        "leetcode"

    override fun solve(input: String): String = Solution().makeFancyString(input)

    private class Solution {
        fun makeFancyString(s: String): String =
            StringBuilder()
                .apply {
                    s.forEachIndexed { index, c ->
                        if (!(index >= 2 && s[index - 1] == c && s[index - 2] == c)) append(c)
                    }
                }.toString()
    }
}
