package collegewallah.lectureeighteen

import collegewallah.lecturefifteen.printArray

fun sortZeroOrOne(arr: Array<Int>) {
    var k = arr.size-1
    var i = 0
    var j = arr.size-1
    var temp = 0
    while(i < j) {
        if (arr[i] == 1 && arr[j] == 0) {
            temp = arr[i]
            arr[i++] = arr[j]
            arr[j--] = temp
        }
        if (arr[j] == 1) j--
        if (arr[i] == 0) i++
    }
    printArray(arr)
}