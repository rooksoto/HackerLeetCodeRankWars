package com.rooksoto.hackerleetcoderankwars.problems

interface Problem<T, R> {

    val problemName: String

    val problemDescription: String

    val testInput: T

    val testSolution: R

    fun solve(input: T): R

    fun isSolved(): Boolean =
        solve(testInput) == testSolution

    fun evaluate(): Unit =
        isSolved().let { solved ->
            println("${if (solved) "✅" else "❌"} $problemName has${if (solved) " " else " not "}been solved.")
        }
}
