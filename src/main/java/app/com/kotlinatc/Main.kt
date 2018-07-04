package app.com.kotlinatc

//Herencia
/*open class Student{
    var Name: String? = null
    var Collage: String? = null
    var Age: Int? = null


    constructor(Name: String, Collage: String, Age: Int):this(){
        this.Name=Name
        this.Collage=Collage
        this.Age=Age
        println("Name :" + this.Name)
        println("Collage :" + this.Collage)
        println("Age :" + this.Age)
    }

    constructor()
}
class Teacher ():Student ()
fun main() {
    // println("Hello, world!")
    //var ITStudent = Student("Leidy", "Inem", 21)
    var IT_Teacher=Teacher()
    IT_Teacher.Name ="George"
    //println("Name :" + IT_Teacher.Name)
}*/


//Clase abstracta
/*
abstract class ComputerCourse(){

    abstract fun courseprice()
    abstract fun courseprerequisite()

}

class LanguageCourse():ComputerCourse() {

    override fun courseprerequisite() {
        println("Course price")
    }

    override fun courseprice() {
        println("Course prerequisite")
    }
}


fun main() {
    var x = LanguageCourse()
    x.courseprerequisite()
    x.courseprice()
}
*/

//Generic class
/*
class Permission<T> {
    var UserName: T? = null
    var Password: T? = null
}


fun main() {
    var x = Permission<String>()
    x.UserName = "William"
    x.Password = "Android"

    println("UserName: ${x.UserName}")

    var y = Permission<Int>()
    y.UserName = 1
    y.Password = 2

    println("UserName: ${y.UserName}")
}*/


