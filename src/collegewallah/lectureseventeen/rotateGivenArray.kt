package collegewallah.lectureseventeen

import collegewallah.lecturefifteen.printArray

fun rotateGivenArray(arr: Array<Int>) {
    print("\nEnter the Value of kth:: ")
    var k = readln().toIntOrNull() ?: 0
    var j = 0
    var endElement = 0

    for (i in 0 ..< k % arr.size) {
        endElement = arr[arr.size-1]
        j = arr.size-1
        while (j >= 1) {
            arr[j] = arr[--j]
        }
        arr[0] = endElement
    }
    printArray(arr)
}

fun secondApproachRotate(arr: Array<Int>) {
    print("\nEnter the Value of kth:: ")
    val k = (readln().toIntOrNull() ?: 0) % arr.size
    val ansArray = Array<Int>(arr.size){0}
    var index = 0
    for (i in (arr.size - k) ..< arr.size) {
        ansArray[index++] = arr[i]
    }

    for (i in 0 ..< (arr.size - k)) {
        ansArray[index++] = arr[i]
    }

    printArray(ansArray)
}

fun thirdApproachRotate(arr: Array<Int>) {
    print("\nEnter the Value of kth:: ")
    val k = (readln().toIntOrNull() ?: 0) % arr.size

    reverse(arr.size - k, arr.size - 1, arr)
    reverse(0, (arr.size - k - 1), arr)
    reverse(0, arr.size-1, arr)
    printArray(arr)
}

fun reverse(i: Int, j: Int, arr: Array<Int>) {
    var indexI = i
    var indexJ = j
    var temp = 0

    while (indexI < indexJ) {
        temp = arr[indexI]
        arr[indexI++] = arr[indexJ]
        arr[indexJ--] = temp
    }

}