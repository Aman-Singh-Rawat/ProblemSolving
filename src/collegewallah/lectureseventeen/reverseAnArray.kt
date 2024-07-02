package collegewallah.lectureseventeen

import collegewallah.lecturefifteen.printArray

fun reverseAnArray(arr: Array<Int>) {
    var i = 0
    var j = arr.size-1
    while (i < j) {
        arr[i] = arr[j] + arr[i]
        arr[j] = arr[i] - arr[j]
        arr[i] = arr[i] - arr[j]
        i++
        j--
    }
    printArray(arr)
}