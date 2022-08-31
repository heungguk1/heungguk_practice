package com.example.heungguk

fun main() {
//    helloWorld()

//    println(add(4, 5))

    //3. string template

    /*
    val name = "Wonjun"
    val lastName = "Lee"

    println("my name is ${name+lastName} I'm 36")

    println("is this true? ${1==0}")

    println("this is 2\$a")
     */

//    checkNum(1)

//    forAndWhile()

    nullcheck()

    //ignoreNulls("heungguk haha")
}

fun maxBy(a : Int, b : Int) : Int {
    if (a > b){
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b: Int) = if (a > b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        //else -> println("I don't Know")     // fun같은 경우는 else를 안써도 됨
    }

    var b : Int = when(score) {
        1->1
        2->2
        else -> 3   //return 형 인 경우는 else가 필수
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 80..90 -> println("not bad")
        else -> println("okay")
    }
}

//1. 함수

fun helloWorld() : Unit {
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value

fun hi() {

    val a : Int = 10  // 상수 (변할수없는)
    var b : Int = 9 //variable 변할수있는

    b = 100

    val c = 100 // 코틀린은 타입을 명시안해도 초기값에 int값을 넣으면 int로 인식, 하지만 초기값 설정안하면 타입명시 필요
    // ex) var c : Int
    var d = 100 // var과 var은 명시 필요
    var name = "wonjun"

}

// Expression vs Statement

// Expression - 뭔가 작업을 해서 값을 리턴하는 것 (kotlin의 모든 함수는 Expression)
// Statement - 값을 리턴하지 않음. checkNum 함수내 when(score) 가 그에 해당.

// 5. Array and List

// Array
// - 메모리를 미리 할당하고 시작

// List
// - array와 다르게 interface. 값을 가져오는것 가능
// List 1. immutableList (수정이 불가능한) List 2. mutableList
// - 하지만 mutableList 는 값을 변경이 가능
//      가장 대표적인게 arrayList

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3 //array는 mutable 임. 수정이 가능

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

}

// 6. 반복문  For / while

fun forAndWhile() {

    val students = arrayListOf("joyce","james", "jenny","jennifer")

    for ( name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex() ) {
        println("${index}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1..10){
        sum += i
    }
/*
    for (i in 1..10 step 2) {
        sum += i
    }

    for (i in 10 downTo 1) {
        sum += i
    }

    for (i in 1 until 100) {    // 1부터 99까지 (100을포함하지 않음)
        sum += i
    }
*/
    println(sum)

    var index = 0
    while(index<10){
        println("current Index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull

// NPE : Null Pointer Exception
//  --> 컴파일 시점이 아닌 런타임 시점에 잡아주는것 (실행을 해봐야지만 알수 있음)

// kotlin에서는 ? (optional) 사용하면 컴파일 시점에 잡음
fun nullcheck() {
    var name : String = "joyce"

    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()   //null이 아님 uppercase를 아니면 null을 반환

    println(nullNameInUpperCase)

    // ?:
    // 이 연산자는 null이면 다른 디폴트값을 쓸수있도록 하는것

    val lastName : String? = null

    val fullname = name + " " + (lastName?: "NO lastName")

    println(fullname)

    // !!
    // 이 연산자는 null이 아님을 확실히 아는 경우 사용 . 아래 ignoreNulls 함수 참고


}

fun ignoreNulls(str : String?) {
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()
    println(upper)

    //let은 null 이 아닌 경우 람다식처럼 내부 함수를 실행하는것!
    val email : String?="heungguk@naver.com"
    email?.let {
        println("my email is ${it}")
    }
}

