package main

import collegewallah.lectureeighteen.sortNonDecreasing
import collegewallah.lectureeighteen.sortZeroOrOne
import collegewallah.lectureeighteen.swapEvenOrOdd
import collegewallah.lecturefifteen.printArray
import collegewallah.lecturefifteen.smallestOrLargest
import collegewallah.lectureseventeen.reverseAnArray
import collegewallah.lectureseventeen.rotateGivenArray
import collegewallah.lectureseventeen.secondApproachRotate
import collegewallah.lectureseventeen.thirdApproachRotate
import collegewallah.lecturetennumbersystem.decimalToBinary
import collegewallah.patternprinting.*

fun main() {
    print("Enter the Size of Array:: ")
    val n = readln().toIntOrNull() ?: 0

    val arr = Array<Int>(n){0}
    print("\nEnter $n Elements in Array:: \n")
    for (i in 0 ..< n) {
        print("Elements of Array[$i]:: ")
        arr[i] = readln().toIntOrNull() ?: 0
    }
    //sortZeroOrOne(arr)
    //swapEvenOrOdd(arr)
    sortNonDecreasing(arr)
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
    val arr = smallestOrLargest()
    printArray(arr)
}

fun lectureTen() {
    print("Enter the Value for converting:: ")
    val value = readln().toIntOrNull() ?: 0
    //binaryToDecimal(value)
    decimalToBinary(value)
}
fun lectureNinePatterPrinting() {
    print("How Many Row's Contain this Pattern:: ")
    val row = readln().toIntOrNull() ?: 0

    print("How Many Column's Contain this Pattern:: ")
    val column = readln().toIntOrNull() ?: 0

    //rectangularPattern()
    //triangularPattern()
    //reverseTriangularPattern()
    //pyramidPattern()
//    pyramidPatternWithInstructor()
//    numericalRectangularPattern()
//    ajibProblem(row, column)
    //numericalTriangularPattern(row, column)
    numericalHoloTriangularPattern(row, column)
}