package com.knoldus

object Driver extends App {
  val listOfSome = new ListOfSomeOfNumbers
  val list = List(Some(9), Some(2), Some(3), Some(1), Some(11))
  val addition = "addition"
  val multiplication = "multiplication"
  val absSubtraction = "absolute-subtraction"
  val normalSubtraction = "normal-subtraction"
  val division = "division"

  val AdditionResult = listOfSome.extractValuesFromList(list, addition)
  val multiplecationResult = listOfSome.extractValuesFromList(list, multiplication)
  val absSubtractionResult = listOfSome.extractValuesFromList(list, absSubtraction)
  val normalSubtractionResult = listOfSome.extractValuesFromList(list, normalSubtraction)

  val emptyList = List().empty

  try {
    listOfSome.extractValuesFromList(emptyList, addition)
    listOfSome.extractValuesFromList(list, division)
  } catch {
    case exception: NullPointerException => exception.getMessage
    case e: IllegalArgumentException => e.getMessage
  }

  println("Sum: " + AdditionResult)
  println("Product: " + multiplecationResult)
  println("Absolute difference: " + absSubtractionResult)
  println("Difference: " + normalSubtractionResult)
}
