# UseOfForExpression

=> This is about Extracting value from a List of Option of Int (List[Option[Int]]), and performing some operations
   on them.
   for examole - Addition , Subtraction and Multiplication
   
   => The above operation are specified or are given defination, In case any other operation is sent to the method, 
      It will throw an MatchError.
   
   => I have used for expression for extracting values in extractValuesFromList method and then pass a list of numbers
      (List[Int]) to the operationOfListOfSome (private ) with the operation by calling it.
   
   => I have used match cases for matching the specified operatoions and then performing operations accordingly.
   
   => For iterating over List[Int] and performing operations, I have used foldLeft method.
    
      => For the Addition, i have used sum method
      => For the Multiplication, i have passed 1 as default value in foldLeft method
      => For the Subraction, i have passed head of the List[Int]
   
   
   
