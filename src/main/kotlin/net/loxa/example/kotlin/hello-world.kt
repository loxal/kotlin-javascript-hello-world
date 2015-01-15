package net.loxal.example.kotlin

import kotlin.js.dom.html.document
import org.w3c.dom.Element

public class HelloWorld {
}

fun main(args: Array<String>) {
    println("JavaScript generated through Kotlin")

    sayHelloViaDom()
}

private fun sayHelloViaDom() {
    val container: Element = document.getElementById("container")
    container.textContent = "Hello, DOM!"
}