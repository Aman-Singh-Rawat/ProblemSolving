package collegewallah.lecturefifteen

fun smallestOrLargest(): Array<Int> {
    val arr = takeInputArray()
    val ansArray = Array<Int>(2) {0}
    ansArray[0] = arr[0]
    ansArray[1] = arr[0]
    for (i in arr.indices) {
        if (arr[i] < ansArray[0]) ansArray[0] = arr[i]
        if (arr[i] > ansArray[1]) ansArray[1] = arr[i]
    }

    return ansArray
}

fun takeInputArray(): Array<Int> {
    print("Enter the Size of Array:: ")
    val size = readln().toIntOrNull() ?: 0
    val arr = Array<Int>(size) {0}
    for (i in 0 ..< size) {
        print("Array of Elements[$i]:: ")
        arr[i] = readln().toIntOrNull() ?: 0
    }
    return arr
}

fun printArray(arr: Array<Int>) {
    print("\nArray Of Elements Are:: ")
    arr.forEach {
        print("$it ")
    }
}