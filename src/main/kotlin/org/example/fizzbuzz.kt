package org.example

class FizzBuzz {
  fun run(size: Int): List<String> {
    return (1..size).map { 
      convertNumber(it)
    }
  }

  private fun convertNumber(int: Int): String {
    if (int % 15 == 0) { return "FizzBuzz" }
    if (int % 3 == 0) { return "Fizz" }
    if (int % 5 == 0) { return "Buzz" }
    return int.toString()
  }
}