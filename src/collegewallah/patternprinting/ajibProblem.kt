package collegewallah.patternprinting

fun ajibProblem(row: Int, column: Int) {
    for (i in 1 .. row) {
        for (j in i ..< column+i) {
            if (j % 2 == 0) print("2")
            else print("1")
        }
        println()
    }
}