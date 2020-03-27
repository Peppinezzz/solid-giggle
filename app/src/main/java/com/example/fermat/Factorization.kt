package com.example.fermat

import kotlin.math.sqrt
import kotlin.math.ceil
import kotlin.math.floor

fun factorize(value: Int): Pair<Int, Int> {
    var a = ceil(sqrt(value.toDouble())).toInt()
    var b2 = a.times(a) - value
    while (ceilSqrt(b2) != floorSqrt(b2)) {
        a++
        b2 = a.times(a) - value
    }
    val b = floorSqrt(b2)
    return a - b to a + b
}

private fun ceilSqrt(x: Int): Int = ceil(sqrt(x.toDouble())).toInt()

private fun floorSqrt(x: Int): Int = floor(sqrt(x.toDouble())).toInt()
