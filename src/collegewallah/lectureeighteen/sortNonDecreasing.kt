package collegewallah.lectureeighteen

import collegewallah.lecturefifteen.printArray
import kotlin.math.abs

fun sortNonDecreasing(arr: Array<Int>) {
    val ans = Array<Int>(arr.size){0}
    var k = ans.size-1
    var i = 0
    var j = arr.size-1

    while (i < j) {
        if (abs(arr[i]) > abs(arr[j])) {
            ans[k--] = arr[i] * arr[i]
            i++
        }
        if (abs(arr[i]) < abs(arr[j])) {
            ans[k--] = arr[j] * arr[j]
            j--
        }
    }
    ans[k] = arr[i]

    printArray(ans)
}