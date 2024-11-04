package com.rooksoto.hackerleetcoderankwars.problems.leetcode

import com.rooksoto.hackerleetcoderankwars.problems.Problem

interface LeetCodeProblem<T, R> : Problem<T, R> {

    val id: Int

    val difficulty: Difficulty
}
