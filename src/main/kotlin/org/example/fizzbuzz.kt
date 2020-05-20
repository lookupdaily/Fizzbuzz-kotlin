package org.example

class FizzBuzz {
  fun run(size: Int): List<String> {
    return (1..size).map { 
      when(it) {
        3 ->  "Fizz"
        5 -> "Buzz"
        else -> it.toString()
      }
    }
  }
}