package collegewallah.lecturesixteen

import collegewallah.lecturefifteen.takeInputArray

fun arrayManipulation() {
    val arr = takeInputArray()
    var ans = false
    for (i in arr.indices) {
        for (j in i+1 ..< arr.size) {
            if (arr[i] == arr[j] && arr[i] > -1) {
                arr[i] = -1
                arr[j] = -1
                break
            }

            if (j == arr.size-1 && arr[i] != arr[j]) {
                ans = true
            }
        }
        if (ans) {
            println("${arr[i]} is a Unique number")
            break
        }
    }

//    for (i in arr.indices) {
//        if (arr[i] != -1) {
//            println("${arr[i]} is a Unique number")
//            break
//        }
//    }
}

fun takingInputArray(): Array<Int> {
    print("Enter the Size of Array:: ")
    val n = readln().toIntOrNull() ?: 0

    val arr = Array<Int>(n){0}
    print("\nEnter $n Elements in Array:: \n")
    for (i in 0 ..< n) {
        print("Elements of Array[$i]:: ")
        arr[i] = readln().toIntOrNull() ?: 0
    }
    return arr
}