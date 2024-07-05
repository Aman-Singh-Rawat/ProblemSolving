package main

import collegewallah.lectureninteen.partitionTheArray
import collegewallah.lectureninteen.prefixSum
import collegewallah.lectureninteen.prefixSumWithQueries

fun main() {
    print("Enter the Size of Array:: ")
    val n = readln().toIntOrNull() ?: 1

    val arr = Array<Int>(n){0}
    print("\nEnter $n Elements in Array:: \n")
    for (i in 0 ..< n) {
        print("Elements of Array[$i]:: ")
        arr[i] = readln().toIntOrNull() ?: 0
    }

    partitionTheArray(arr)

}










fun lectureEighteen() {

    //sortZeroOrOne(arr)
    //swapEvenOrOdd(arr)
    //sortNonDecreasing(arr)
}

fun lectureSeventeen() {

    //arrayManipulation()
    //reverseAnArray(arr)
    //rotateGivenArray(arr)
    //secondApproachRotate(arr)
    //thirdApproachRotate(arr)
}

fun lectureSixteen() {

    //secondLargest(arr)

    //print("\nYour Answer is:: ${integerInArrayOrNot(arr)}")
}
fun lectureFifteen() {
//    val arr = smallestOrLargest()
//    printArray(arr)
}

fun lectureTen() {
//    print("Enter the Value for converting:: ")
//    val value = readln().toIntOrNull() ?: 0
//    //binaryToDecimal(value)
//    decimalToBinary(value)
}
fun lectureNinePatterPrinting() {
//    print("How Many Row's Contain this Pattern:: ")
//    val row = readln().toIntOrNull() ?: 0
//
//    print("How Many Column's Contain this Pattern:: ")
//    val column = readln().toIntOrNull() ?: 0

    //rectangularPattern()
    //triangularPattern()
    //reverseTriangularPattern()
    //pyramidPattern()
//    pyramidPatternWithInstructor()
//    numericalRectangularPattern()
//    ajibProblem(row, column)
    //numericalTriangularPattern(row, column)
//    numericalHoloTriangularPattern(row, column)
}