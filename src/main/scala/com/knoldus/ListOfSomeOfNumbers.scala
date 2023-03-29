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
      case "multiplication" => list.foldLeft(1)(_ * _) // Alternate of this operation is =>  list.product
      case "absolute-subtraction" => list.foldLeft(list.headOption.getOrElse(0))(_ - _).abs
      case "normal-subtraction" => list.foldLeft(list.headOption.getOrElse(0))(_ - _)
      case _ => throw new MatchError
    }
  }
}



