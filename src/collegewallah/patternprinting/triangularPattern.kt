package collegewallah.patternprinting

fun triangularPattern() {
    for (i in 0 ..< 4) {
        for (j in 0 .. i) {
            print("*")
        }
        println()
    }
}

fun reverseTriangularPattern() {
    for (i in 3 downTo 0) {
        for (j in 0 .. i) {
            print("*")
        }
        println()
    }
}