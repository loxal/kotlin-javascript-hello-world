(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    com: Kotlin.definePackage(null, /** @lends _.com */ {
      example: Kotlin.definePackage(null, /** @lends _.com.example */ {
        kotlin: Kotlin.definePackage(null, /** @lends _.com.example.kotlin */ {
          HelloWorld: Kotlin.createClass(null, null),
          main: function (args) {
            Kotlin.println('JavaScript generated through Kotlin');
            _.com.example.kotlin.sayHelloViaDom();
          },
          sayHelloViaDom: function () {
            var container = document.getElementById('container');
            container.textContent = 'Hello, DOM!';
          }
        })
      })
    })
  });
  Kotlin.defineModule('kotlin-javascript-hello-world', _);
  _.com.example.kotlin.main([]);
}(Kotlin));
