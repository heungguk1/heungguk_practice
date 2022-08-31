package com.example.heungguk

//자바와 다르게 클래스이름을 파일과 다르게 해도됨
open class Human( val name : String = "Anonymous") {  //파라미터 없으면 기본값으로 이거 사용

    //val name = name   클래스파라미터에서 val로 바로 설정, 주입 가능

    constructor(name : String , age : Int) : this(name){    //부생성자
        println("my name is ${name}, ${age}years old")
    }

    init {  // 주생성자의 일부인  init블록이 항상 먼저 실행됨. constructor보다 먼저 실행됨.
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so YUMMMYYY~~~~")
    }

    open fun singAsong() {
        println("lalala")
    }
}

class Korean : Human("wonjun") {    // kotlin의 클래스는 기본적으로 final이라  상속받으려면 클래스 앞에 "open" 써야함.

    override fun singAsong() {
        super.singAsong() //부모의 singAsong함수 사용할때 super 사용
        println("랄랄라")
        println("my name is :${name}")
    }

}


fun main() {
//    val human = Human("minsu")  // 자바 - val human = new Human()
//
//    val stranger = Human()
//    human.eatingCake()
//
    val mom = Human("Yeongsin", 66)
//
//    println("this human's name is ${stranger.name}")
    val korean = Korean()
    korean.singAsong()
}