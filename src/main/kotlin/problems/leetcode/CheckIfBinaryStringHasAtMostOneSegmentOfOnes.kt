package com.rooksoto.hackerleetcoderankwars.problems.leetcode

class CheckIfBinaryStringHasAtMostOneSegmentOfOnes : LeetCodeProblem<String, Boolean> {
    override val id: Int =
        1784

    override val difficulty: Difficulty =
        Difficulty.Easy

    override val problemName: String =
        "Check if Binary String Has at Most One Segment of Ones"

    override val problemDescription: String =
        """
        Given a binary string s without leading zeros, return true if s contains at most one contiguous segment of ones. Otherwise, return false.
        """.trimIndent()

    override val testInput: String =
        "1001"

    override val testSolution: Boolean =
        false

    override fun solve(input: String): Boolean = Solution().checkOnesSegment(input)

    private class Solution {
        fun checkOnesSegment(s: String): Boolean = !s.contains("01")
    }
}
