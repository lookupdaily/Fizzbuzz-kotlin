package org.example

class FizzBuzz {
  fun run(size: Int): List<String> {
    return (1..size).map { it.toString()}
  }
}