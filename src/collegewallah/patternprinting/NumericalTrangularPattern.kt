package collegewallah.patternprinting

fun numericalTriangularPattern(row: Int) {
    for (i in 1 .. row) {
        for (j in 1 .. i) {
            print(j)
        }
        println()
    }
}

fun numericalTriangularPattern(row: Int, column: Int) {
    for (i in 1 .. 4) {
        for (j in row - 1 downTo i) {
            print(" ")
        }
        for (k in 1 .. i) {
            print(k)
        }
        for (l in i - 1 downTo 1) {
            print(l)
        }
        println()
    }
}

fun numericalHoloTriangularPattern(row: Int, column: Int) {
    for (i in 1 .. row) {
        for (j in 1 .. row-i) {
            print(" ")
        }
        for (k in 1 ..< i+i) {
            if (k == 1 || k == (i+i) - 1 || i == row)
                print(i)
            else print(" ")
        }
        for (l in row - 1 downTo i) {
            print(" ")
        }
        println()
    }
}