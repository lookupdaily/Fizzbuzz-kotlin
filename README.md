# FizzBuzz in Kotlin

After 'Hello, World!' comes... FizzBuzz

A simple kata, TDDd to get a quick taste of the [Kotlin](https://github.com/JetBrains/kotlin) programming language

## About

The classic campfire game requires a continuous sequence of numbers from 1 to 100, with a few exceptions:

- 3 and multiples of 3 are replaced with 'Fizz'
- 5 and multiples of 5 are replaced with 'Buzz'
- multiples of 3 AND 5 are replaced with 'FizzBuzz'

Check out more detailed instructions for this kata on [Coding Dojo](https://codingdojo.org/kata/FizzBuzz/)

## Technologies

- Language: Kotlin
- Testing: JUnit4
- Tools: Gradle (build)

## Getting started

- Clone this repo to your local machine
- `brew install java`
- `brew install gradle`
- `gradle`

## Usage

You can run FizzBuzz in the Kotlin REPL:
```shell
$ kotlin
```

```kotlin
>>> :load src/main/kotlin/org/example/fizzbuzz.kt
>>> fizzBuzz = FizzBuzz()
>>> fizzBuzz.run(size = 100)
```
The sequence will be returned as a Kotlin Collection - a List of strings.

## Running tests

```shell
$ gradle test
```