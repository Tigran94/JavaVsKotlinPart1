fun main() {
    var x = 10

    if(x in 12..22){
        println("in 1..12")
    }else if (x in 'a'..'b'){
        println("in 'a'..'b'")
    }
    else if (x in 5 downTo  1){
        println("in 5 downTo 1")
    }
    else if (x in 5 until  7){
        println("in 5 downTo 1")
    }else if (x !in 24..26){
        println("!in 24..26")
    }

//    println((1..3).toList())
}