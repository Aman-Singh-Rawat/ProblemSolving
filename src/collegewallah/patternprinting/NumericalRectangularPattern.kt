package collegewallah.patternprinting

fun numericalRectangularPattern() {
    for (i in 1 .. 7) {
        for (j in i .. 7) {
            print("$j ")
        }
        for (k in 1 ..< i) {
            print("$k ")
        }
        println()
    }
}