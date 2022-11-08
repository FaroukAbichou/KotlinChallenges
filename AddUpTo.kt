
val n:Int=54

fun somm(n:Int):Int{
    var s=0
    for (i in 1..n){
        s+=i
    }
    return s
}

fun main(args: Array<String>){
    println(somm(n))
}
