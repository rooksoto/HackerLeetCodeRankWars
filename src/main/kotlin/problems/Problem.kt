package com.rooksoto.hackerleetcoderankwars.problems

interface Problem<T, R> {

    val problemName: String

    val problemDescription: String

    val testInput: T

    val testSolution: R

    /**
     * Provides a solution for a given problem input and returns the result.
     *
     * @param input The input parameter for the problem to be solved.
     * @return The result of solving the problem with the given input.
     */
    fun solve(input: T): R

    fun isSolved(): Boolean =
        solve(testInput).let { result ->
            when (result) {
                is IntArray -> result.contentEquals(testSolution as IntArray)
                else -> result == testSolution
            }
        }

    fun evaluate(): Unit =
        isSolved().let { solved ->
            println("${if (solved) "✅" else "❌"} \"$problemName\" has${if (solved) " " else " not "}been solved.")
        }
}
