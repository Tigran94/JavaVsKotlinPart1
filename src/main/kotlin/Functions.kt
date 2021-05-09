fun main() {
//    compare(3, 3)
//    compare(3, 3, "tuyn")
//
//    compare2(x = 3, y = 3)
//    compare2(y = 3, x = 3, text = "tuyn")
//
//    println(oneExpression())

//    checkNothing()

//    `senc el a dzev`()
}

private fun compare(x: Int, y: Int, text: String = "$x > $y"): Unit {
//    x = 3
    if (x > y) println(text) else println("")
}

//private fun compare2(text: String = "$x > $y", x: Int, y: Int): Unit {
//    if (x > y) {
//        println(text)
//    } else println("")
//}

private fun compare2(text: String = "x > y", x: Int, y: Int): Unit {
    if (x > y) println(text) else println("")
}


private fun oneExpression() = "print something"

fun checkNothing(): Nothing {
    throw Exception()
//    TODO("implement the string building functionality here to return a string")
}

private fun `senc el a dzev`(){
    println("senc el a dzev")
}