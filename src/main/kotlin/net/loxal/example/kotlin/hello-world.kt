/*
 * Copyright 2015 Alexander Orlov <alexander.orlov@loxal.net>
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

import kotlin.js.dom.html.document
import org.w3c.dom.Element

public class HelloWorld {
}

val container: Element = document.getElementById("container")

fun main(vararg args: String) {
    println("JavaScript generated through Kotlin")

    sayHelloViaDom()
    sayHelloViaInlinedJavaScript()
}

private fun sayHelloViaDom() {
    container.textContent = "Hello, DOM! Kotlin is writing..."
}

private fun sayHelloViaInlinedJavaScript() {
    js("document.writeln('Hello, from inlined JavaScript in Kotlin!')")
}