import java.util.*

fun main() {
string("Mercy","Akirachix","Kenya","Lisalab")
    numbers()
   var names= human("Mercy","Wangari","Kinyanjui")
    println(Arrays.toString(names))
    cities()

}



fun string(name:String,school:String,country:String,classes:String){
var string=arrayOf(name, school,country,classes)
    println(Arrays.toString(string))




}
fun cities(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities[0].capitalize()+" "+cities[1].capitalize()+" "+cities[2].capitalize()+" "+cities[3].capitalize())

}
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numbers.component2()+numbers.component5()
    println(total)
    var index=numbers.indexOf(158)
    println(index)
    var sortit=numbers.sortedArray()
    for(elements in sortit){
       println(elements)

    }

    }

fun human(name1:String, name2:String, name3:String):Array<String>{
    var names=arrayOf(name1,name2,name3)
    return names









}

