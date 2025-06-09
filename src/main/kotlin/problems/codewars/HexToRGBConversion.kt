package com.rooksoto.hackerleetcoderankwars.problems.codewars

class HexToRGBConversion : CodeWarsProblem<String, HexToRGBConversion.RGB> {
    override val kyu: Int =
        5

    override val problemName: String =
        "Hex to RGB Conversion"

    override val problemDescription: String =
        """
        When working with color values it can sometimes be useful to extract the individual red, green, and blue (RGB) component values for a color. Implement a function that meets these requirements:

        Accepts a case-insensitive hexadecimal color string as its parameter (ex. "#FF9933" or "#ff9933")
        Returns a Map<String, int> with the structure {r: 255, g: 153, b: 51} where r, g, and b range from 0 through 255
        Note: your implementation does not need to support the shorthand form of hexadecimal notation (ie "#FFF")

        Example

        "#FF9933" --> {r: 255, g: 153, b: 51}
        """.trimIndent()

    override val testInput: String =
        "#FF9933"

    override val testSolution: RGB =
        RGB(255, 153, 51)

    override fun solve(input: String): RGB =
        hexStringToRGB(input)

    private fun hexStringToRGB(hexString: String): RGB =
        with(hexString) {
            RGB(
                r = substring(1, 3).toInt(16),
                g = substring(3, 5).toInt(16),
                b = substring(5, 7).toInt(16),
            )
        }

    data class RGB(
        val r: Int,
        val g: Int,
        val b: Int,
    )
}
