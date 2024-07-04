package collegewallah.lectureeighteen

import collegewallah.lecturefifteen.printArray

fun swapEvenOrOdd(arr: Array<Int>) {
    var i = 0
    var j = arr.size-1
    var temp = 0
    while (i < j) {
        if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
            temp = arr[i]
            arr[i++] = arr[j]
            arr[j--] = temp
        }
        if (arr[i] % 2 == 0) i++
        if (arr[j] % 2 != 0) j--
    }
    println(-10 * -10)
    printArray(arr)

}