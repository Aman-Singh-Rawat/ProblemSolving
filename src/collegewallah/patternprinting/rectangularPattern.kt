package collegewallah.patternprinting

fun rectangularPattern() {
    for (i in 0 ..< 4) {
        for (j in 0 ..< 6) {
            if (i == 0 || i == 3 || j == 0 || j == 5) print("*")
            else print(" ")
        }
        println()
    }
}