package org.example

import org.junit.Assert.assertEquals
import org.junit.BeforeClass
import org.junit.Test

class FizzBuzzTest {
  private val fizzBuzz = FizzBuzz()
  
  @Test fun `simple numbers`() {
    val output = fizzBuzz.run(size = 2)
    assertEquals(listOf("1","2"),output)
  }
  @Test fun `three is Fizz`() {
    val output = fizzBuzz.run(size = 3)
    assertEquals(listOf("1","2","Fizz"),output)
  }

  @Test fun `five is Buzz`() {
    val output = fizzBuzz.run(size = 5)
    assertEquals(
      listOf("1","2","Fizz","4","Buzz"),
      output
    )
  }

  @Test fun `multiples of 3 are Fizz`() {
    val output = fizzBuzz.run(size = 6)[5]
    assertEquals("Fizz",output)
   }

  @Test fun `multiples of 5 are Buzz`() {
    val output = fizzBuzz.run(size = 10)[9]
    assertEquals("Buzz",output)
  }

  @Test fun `multiples of 3 and 5 are FizzBuzz`() {
    val output = fizzBuzz.run(size = 15)[14]
    assertEquals("FizzBuzz",output)
  }
}