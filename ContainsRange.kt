
fun GetRenge():Boolean{
    var list1= listOf<Int>(1,2,3,4,5,6,7,8,9)
    var list2= listOf<Int>(2,3,4,5,6)
    val max1 = list1.maxOrNull() ?: 0
    val max2 = list2.maxOrNull() ?: 0
    val min1 = list1.minOrNull() ?: 0
    val min2 = list2.minOrNull() ?: 0
    if(max1>=max2 && min1<=min2){
        return true
    }
    else{
        return false
    }
}

fun main(){
    println(GetRenge())
}