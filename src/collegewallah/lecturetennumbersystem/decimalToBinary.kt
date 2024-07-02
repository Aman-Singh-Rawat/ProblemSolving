package collegewallah.lecturetennumbersystem

fun decimalToBinary(num: Int) {
    var n = num
    var str: String = ""
    while (n >= 1) {
        str = (n % 2).toString() + str
        n /= 2
    }
    print(str)
}