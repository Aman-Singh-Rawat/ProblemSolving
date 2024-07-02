package collegewallah.lecturetennumbersystem

fun binaryToDecimal(value: Int) {
    var n = value
    var ans = 0
    var pw = 1

    while (n > 0) {
        ans += ((n % 10) * pw)
        n /= 10
        pw *= 2
    }
    println("After converting Binary to Decimal value is:: $ans")

}