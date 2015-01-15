(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    net: Kotlin.definePackage(null, /** @lends _.net */ {
      loxal: Kotlin.definePackage(null, /** @lends _.net.loxal */ {
        example: Kotlin.definePackage(null, /** @lends _.net.loxal.example */ {
          kotlin: Kotlin.definePackage(function () {
            this.container = document.getElementById('container');
          }, /** @lends _.net.loxal.example.kotlin */ {
            HelloWorld: Kotlin.createClass(null, null),
            main: function (args) {
              Kotlin.println('JavaScript generated through Kotlin');
              _.net.loxal.example.kotlin.sayHelloViaDom();
              _.net.loxal.example.kotlin.sayHelloViaInlinedJavaScript();
            },
            sayHelloViaDom: function () {
              _.net.loxal.example.kotlin.container.textContent = 'Hello, DOM! Kotlin is writing...';
            },
            sayHelloViaInlinedJavaScript: function () {
              document.writeln('Hello, from inlined JavaScript in Kotlin!');
            }
          })
        })
      })
    })
  });
  Kotlin.defineModule('kotlin-javascript-hello-world', _);
  _.net.loxal.example.kotlin.main([]);
}(Kotlin));
