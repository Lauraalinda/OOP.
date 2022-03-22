fun main(){
    var laura=human("laura",21,50)
    laura.eat(2)
    println(laura.weight)
    laura.Speak("I LOVE KOTLIN")

    laura.birthday(1)
    println(laura.age)
    var alinda=User("laura","alinda", "lauraallindaa@gmmail.com", "0756046099","2113")
    println(alinda.firstName)
    println(alinda.email)



}
class human(var name: String, var age:Int, var weight: Int) {

    fun eat(foodWeight: Int): Int{
        var foodWeight=2
        println("I am eating ${foodWeight}kgs of food.")
        weight += foodWeight
        return weight
    }

    fun Speak(speech:String){
        println(speech)

    }
    fun birthday(day:Int):Int{
        age+=day
        return age
    }

}
data class User(var firstName:String, var lastName:String ,var email: String, var phoneNumber: String,var password: String)


