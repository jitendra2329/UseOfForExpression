package com.knoldus

class ListOfSomeOfNumbers {
  //extracting the values from the list of Option and calling the operationOfListOfSome method for operations
  def extractValuesFromList(list: List[Option[Int]], operationOfList: String): Int = {
    if (list.nonEmpty) {
      val result = for {
        value <- list
      } yield value.getOrElse(0)

      operationOfListOfSome(result, operationOfList)
    } else 0
  }

  //performing operation on values of the list
  private def operationOfListOfSome(list: List[Int], operationOfList: String): Int = {
    operationOfList match {
      case "addition" => list.sum
      case "multiplication" => list.product
      case "absolute-subtraction" => absoluteSubtraction(list)
      case "normal-subtraction" => normalSubtraction(list)
      case _ => throw new MatchError
    }
  }

  private def absoluteSubtraction(list: List[Int]): Int = {
    val subtractionResult = list.foldLeft(list.headOption.getOrElse(0))(_ - _) + list.headOption.getOrElse(0)
    subtractionResult.abs
  }

  private def normalSubtraction(list: List[Int]): Int = {
    val subtractionResult = list.foldLeft(list.headOption.getOrElse(0))(_ - _) + list.headOption.getOrElse(0)
    subtractionResult
  }
}



