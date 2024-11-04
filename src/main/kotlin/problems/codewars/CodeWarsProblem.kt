package com.rooksoto.hackerleetcoderankwars.problems.codewars

import com.rooksoto.hackerleetcoderankwars.problems.Problem

interface CodeWarsProblem<T, R> : Problem<T, R> {

    val kyu: Int
}
