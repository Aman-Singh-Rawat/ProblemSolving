package collegewallah.patternprinting

fun pyramidPattern() {
    for (i in 0 ..< 4) {
        for (k in i ..< 3) { //here we replace 3 to r - 1
            print(" ")
        }
        for (j in 0 .. i*2) {
            print("*")
        }
        println()
    }
}

fun pyramidPatternWithInstructor() {
    for (i in 1 .. 4) {
        for (j in 1 .. 4 - i) {
            print(" ")
        }
        for (k in 1..<(2 * i)) {
            print("*")
        }
        println()
    }
}