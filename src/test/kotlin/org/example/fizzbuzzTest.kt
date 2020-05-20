package org.example

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {
  @Test fun belowFizz() {
    val fizzBuzz = FizzBuzz()

    val output = fizzBuzz.run(size = 2)

    assertEquals(listOf("1","2"),output)
  }


}