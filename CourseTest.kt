

fun main(){
    val max= getMax(74.45,58.58)
    println(max)
}

fun getMax(a:Int,b:Int)= if(a>b) a else b
fun getMax(a:Double,b:Double)= if(a>b) a else b