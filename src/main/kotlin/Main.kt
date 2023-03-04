fun main() {
println(subtract(322292, 22))
    println(getFullName("winnie", "Achando",))
    name("Achando")
    println(figr(27, 2))
    println(add(12,13, 4,65))
    goodfuct("i love cars")


}
fun subtract(num1: Int, num2: Int) :Int{

    var difference = num1 - num2
    return difference
}
fun getFullName(firstName:String, lastName: String): String{
    var fullName = firstName + ""+ lastName
    return fullName
}
fun name(name1:String){
    println("Hello" + name1)
}
fun figr(fig1: Int, fig2:Int): Int{
    var modulus = fig1 % fig2
    return modulus
}
fun add(num3:Int,num4:Int, num5:Int, num6:Int): Int{
    var sum = num3 + num4 + num5 + num6
    return sum
}
fun goodfuct(awesome: String){
    println(awesome)
}

