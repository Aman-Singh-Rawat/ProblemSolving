package collegewallah.lecturesixteen

fun integerInArrayOrNot(arr: Array<Int>): Int {
    for (i in arr.indices) {
        for (j in i+1 ..< arr.size) {
            if (arr[i] == arr[j]) return arr[i]
        }
    }
    return -1
}