package collegewallah.lectureninteen

import collegewallah.lecturefifteen.printArray

fun prefixSum(arr: Array<Int>) {
    for (i in 1 ..< arr.size) {
        arr[i] += arr[i-1]
    }
    //printArray(arr)
}

fun prefixSumWithQueries(arr: Array<Int>) {
    //val ans = Array<Int>(arr.size+1){0}

    for (i in 1 ..< arr.size) {
        arr[i] += arr[i-1]
    }

    var r = 0
    var l = 0

    print("If you stop the queries enter 0:: \n")
    do {
        print("\nEnter The Value of l:: ")
        l = readln().toIntOrNull() ?: 0

        print("Enter The Value of r:: ")
        r = readln().toIntOrNull() ?: 0

        if (r < arr.size)
            print("\nThe Prefix Sum between l or r is:: ${arr[r] - arr[l-1]}")
        else
            print("Kya bhai")
    } while (r != 0)
}