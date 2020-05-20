package org.example

import org.junit.Assert.assertEquals
import org.junit.BeforeClass
import org.junit.Test

class FizzBuzzTest {
  private val fizzBuzz = FizzBuzz()
  
  @Test fun belowFizz() {
    val output = fizzBuzz.run(size = 2)
    assertEquals(listOf("1","2"),output)
  }
  @Test fun threeIsFizz() {
    val output = fizzBuzz.run(size = 3)
    assertEquals(listOf("1","2","Fizz"),output)
  }
}