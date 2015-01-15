package net.loxal.example.kotlin

import kotlin.js.dom.html.document
import org.w3c.dom.Element

public class HelloWorld {
}

val container: Element = document.getElementById("container")

fun main(vararg args: String) {
    println("JavaScript generated through Kotlin")

    sayHelloViaDom()
    sayHelloViaInlinedJavaSript()
}

private fun sayHelloViaDom() {
    container.textContent = "Hello, DOM! Kotlin is writing..."
}

private fun sayHelloViaInlinedJavaSript() {
    js("document.writeln('Hello, from inlined JavaScript in Kotlin!')")
}