package com.example.heungguk

class Book private constructor(val id : Int, val name : String){

    companion object BookFactory :IdProvider{

        override fun getId(): Int {
            return 444
        }

        val myBook = "new book"

        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.create()    // Companion Object - private 프로퍼티나 메소드를 읽어올수 있게 해줌. 자바의 static 같은 역할

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}