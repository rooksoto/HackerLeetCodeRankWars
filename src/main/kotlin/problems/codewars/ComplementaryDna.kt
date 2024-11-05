package com.rooksoto.hackerleetcoderankwars.problems.codewars

class ComplementaryDna : CodeWarsProblem<String, String> {
    override val kyu: Int =
        7

    override val problemName: String =
        "Complementary DNA"

    override val problemDescription: String =
        """
        Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

        If you want to know more: http://en.wikipedia.org/wiki/DNA

        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

        More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)
        """.trimIndent()

    override val testInput: String =
        "ATTGC"
    override val testSolution: String =
        "TAACG"

    override fun solve(input: String): String = makeComplement(input)

    // region Solution

    private fun makeComplement(dna: String): String =
        mapOf(
            'A' to 'T',
            'T' to 'A',
            'C' to 'G',
            'G' to 'C',
        ).let { complementMap ->
            // Note: The `get` operation on the map makes the
            // assumption hat the current item will be in the
            // map. If we don't have that guarantee (as we do
            // here) we should supply a default value (for
            // example, using Map::getOrDefault).
            dna.map(complementMap::get).joinToString("")
        }

    // endregion
}
