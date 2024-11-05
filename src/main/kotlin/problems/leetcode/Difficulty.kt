package com.rooksoto.hackerleetcoderankwars.problems.leetcode

sealed interface Difficulty {
    data object Easy : Difficulty

    data object Medium : Difficulty

    data object Hard : Difficulty
}
