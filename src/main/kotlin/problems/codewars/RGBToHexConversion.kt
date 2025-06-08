package com.rooksoto.hackerleetcoderankwars.problems.codewars

class RGBToHexConversion : CodeWarsProblem<RGBToHexConversion.Params, String> {

    override val kyu: Int =
        5

    override val problemName: String =
        "RGB To Hex Conversion"

    override val problemDescription: String =
        """
        The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal
        representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range
        must be rounded to the closest valid value.
        
        Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
        
        Examples (input --> output):

        255, 255, 255 --> "FFFFFF"
        255, 255, 300 --> "FFFFFF"
        0, 0, 0       --> "000000"
        148, 0, 211   --> "9400D3"
        """.trimIndent()

    override val testInput: Params =
        Params(255, 255, 255)

    override val testSolution: String =
        "FFFFFF"

    override fun solve(input: Params): String =
        rgb(input.r, input.g, input.b)

    private fun rgb(
        r: Int,
        g: Int,
        b: Int,
    ): String =
        listOf(r, g, b)
            .map { intValue ->
                intValue.coerceIn(0, 255)
            }.joinToString("") { coercedValue ->
                coercedValue.toString(16)
                    .padStart(2, '0')
                    .uppercase()
            }

    data class Params(
        val r: Int,
        val g: Int,
        val b: Int,
    )
}
