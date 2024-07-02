package collegewallah.lecturesixteen

fun secondLargest(arr: Array<Int>) {
    var index = findLargest(arr)
    arr[index] = Int.MIN_VALUE

    index = findLargest(arr)
    print("Second Largest Element is:: ${arr[index]}")

}

fun findLargest(arr: Array<Int>): Int {
    var largestNumber = arr[0]
    var index = 0

    for (i in arr.indices) {
        if (largestNumber == arr[i]) arr[i] = Int.MIN_VALUE

        if (largestNumber < arr[i]) {
            largestNumber = arr[i]
            index = i
        }
    }
    return index
}