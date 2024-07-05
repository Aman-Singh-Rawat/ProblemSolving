package collegewallah.lectureninteen

fun partitionTheArray(arr: Array<Int>) {
    prefixSum(arr)

    for (i in arr.indices) {
        if (arr[arr.size-1] - arr[i] == arr[i]) {
            println("\ntrue")
            break
        }
    }
}