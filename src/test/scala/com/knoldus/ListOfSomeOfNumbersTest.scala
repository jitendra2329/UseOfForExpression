package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class ListOfSomeOfNumbersTest extends AnyFlatSpec {
  val listOfSome = new ListOfSomeOfNumbers
  val addition = "addition"
  val absSubtraction = "absolute-subtraction"
  val normalSubtraction = "normal-subtraction"
  val multiplication = "multiplication"

  it should "return sum of values of list" in {
    val list = List(Some(9), Some(2), Some(1), Some(8), Some(5))
    val actualResult = listOfSome.extractValuesFromList(list, addition)
    val expectedResult = 25
    assert(actualResult == expectedResult)
  }

  it should "return absolute difference of values of list" in {
    val list = List(Some(9), Some(2), Some(3), Some(1), Some(11))
    val actualResult = listOfSome.extractValuesFromList(list, absSubtraction)
    val expectedResult = 17
    assert(actualResult == expectedResult)
  }

  it should "return difference of values of list" in {
    val list = List(Some(9), Some(2), Some(3), Some(1), Some(11))
    val actualResult = listOfSome.extractValuesFromList(list, normalSubtraction)
    val expectedResult = -17
    assert(actualResult == expectedResult)
  }

  it should "return product of values of list" in {
    val list = List(Some(9), Some(2), Some(5), Some(7), Some(1))
    val actualResult = listOfSome.extractValuesFromList(list, multiplication)
    val expectedResult = 630
    assert(actualResult == expectedResult)
  }

  it should "return 0 in case of empty list" in {
    val list = List().empty
    val actualResult = listOfSome.extractValuesFromList(list, multiplication)
    val expectedResult = 0
    assert(actualResult == expectedResult)
  }

  it should "throw an exception - MatchError, in case operation is not defined" in {
    an[MatchError] should be thrownBy {
      val list = List(Some(9), Some(2), Some(5), Some(7), Some(1))
      val division = "division"
      listOfSome.extractValuesFromList(list, division)
    }
  }
}
