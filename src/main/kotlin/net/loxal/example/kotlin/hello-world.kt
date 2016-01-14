/*
 * Copyright 2016 Alexander Orlov <alexander.orlov@loxal.net>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.loxal.example.kotlin

import org.w3c.dom.HTMLElement
import kotlin.browser.document

public class HelloWorld {
}

val container = document.getElementById("container") as HTMLElement

fun main(vararg args: String) {
    println("JavaScript generated through Kotlin")

    sayHelloViaDom()
    sayHelloViaJsConsole()
    sayHelloViaInlinedJavaScript()
}

private fun sayHelloViaJsConsole() {
    console.log("Hello from `console.log()`!")
}

private fun sayHelloViaDom() {
    container.textContent = "Hello, DOM! Kotlin is writing…"
}

private fun sayHelloViaInlinedJavaScript() {
    js("document.writeln('Hello, from inlined JavaScript in Kotlin!')")
}