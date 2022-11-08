val ListOfStrings= listOf<String>("Farouk","Anas","Dhia","Sami","Youssef","Mohammed")
val Name:String="Dhia"
fun FindThestring(ListOfStrings:List<String>,Name:String):Int{
    if (Name in ListOfStrings){
        return ListOfStrings.indexOf(Name)
    }
    else{
        return -1
    }
}

fun main(){
    println(FindThestring(ListOfStrings,Name))
}