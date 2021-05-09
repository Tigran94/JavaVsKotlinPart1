const val j: Int = 1000 // correct
// var f: Int – incorrect  (global)
// const var n: Int = 1000 - incorrect

fun main() {

    var x: Int = 4  // correct
    var y = 4 // corrrect
    //var z   incorrect
    var t: String //– correct  (local)

    println("j: $j")
    println("f: $y")
//    println("n: $n")

    println("x: $x")
    println("y: $y")
//    println("z: $z")
//    println("t: $t")

//    println("${if(true) "z" else "y"}")

//    val aa = """asd
//        |asdf
//    """.trimMargin()
//    println(aa)
}