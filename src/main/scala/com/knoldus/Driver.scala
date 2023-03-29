package com.knoldus

object Driver extends App {
  val listOfSome = new ListOfSomeOfNumbers
  val list = List(Some(9), Some(2), Some(3), Some(1), Some(11))
  val emptyList = List().empty
  val addition = "addition"
  val multiplication = "multiplication"
  val absSubtraction = "absolute-subtraction"
  val normalSubtraction = "normal-subtraction"
  val division = "division"

  val AdditionResult = listOfSome.extractValuesFromList(list, addition)
  val multiplecationResult = listOfSome.extractValuesFromList(list, multiplication)
  val absSubtractionResult = listOfSome.extractValuesFromList(list, absSubtraction)
  val normalSubtractionResult = listOfSome.extractValuesFromList(list, normalSubtraction)

  try {
    listOfSome.extractValuesFromList(list, division)
  } catch {
    case exception: MatchError => exception.getMessage
  }

  println("Sum: " + AdditionResult)
  println("Product: " + multiplecationResult)
  println("Absolute difference: " + absSubtractionResult)
  println("Difference: " + normalSubtractionResult)
  println("Result of Empty List : "+listOfSome.extractValuesFromList(emptyList, addition))
}
