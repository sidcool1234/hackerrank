package com.sid.hackerearth

import java.math.BigInteger

class Problems {
    companion object {
        fun problem1() { // https://www.hackerearth.com/problem/algorithm/small-factorials/
            val list = mutableListOf<Int>()
            val numberOfEntries = readLine()!!.toInt()
            for (i in 1..numberOfEntries) {
                list.add(readLine()!!.toInt())
            }

            for (i in list){
                println(factorial(BigInteger.valueOf(i.toLong())))
            }
        }

        fun factorial(n: BigInteger): BigInteger {
            return when (n) {
                BigInteger.ZERO -> BigInteger.ONE
                else -> n.multiply(factorial(n.minus(BigInteger.ONE)))
            }
        }

    }
}

fun main(args: Array<String>) {
    Problems.problem1()
}