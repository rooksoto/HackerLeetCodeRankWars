package com.rooksoto.hackerleetcoderankwars.problems.codewars

class IsHeGonnaSurvive : CodeWarsProblem<IsHeGonnaSurvive.Params, Boolean> {

    override val kyu: Int =
        8

    override val problemName: String =
        "Is he gonna survive?"

    override val problemDescription: String =
        """
            A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?

            Return true if yes, false otherwise :)
        """.trimIndent()

    override val testInput: Params =
        Params(10, 5)

    override val testSolution: Boolean =
        true

    override fun solve(input: Params): Boolean =
        hero(input.bullets, input.dragons)

    // region Solution

    private fun hero(bullets: Int, dragons: Int): Boolean =
        bullets / 2 >= dragons

    // endregion

    data class Params(
        val bullets: Int,
        val dragons: Int,
    )
}
