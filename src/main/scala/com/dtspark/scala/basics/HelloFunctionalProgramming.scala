package com.dtspark.scala.basics

/**
  * 函数可以被简单的任务是包裹了一条或者几条语句的代码体，该代码体接受若干参数，进过代码体处理后返回结果，
  * 例如 f(x)=x+1 在Scala中函数是一等公民，可以向变量一样创值，被赋值，同时函数可以赋值给变量，变量可以赋值给函数，
  * 之所以可以是这样，原因在于函数背后是类和对象，也就是说在运行的时候函数其实是一个变量，当然，背后是Scala语言
  * 自动帮助我们生成的，且可以说天然的被序列化和反序列化，这个意义非常重要：
  *
  * 1，可以天然的序列化和反序列化的直接好处就是函数可以在分布式系统上运行
  * 2，因为函数背后其实是类和对象，所以可以和普通的变量完全一样的应用在任何普通变量可以运用的地方，包括作为参数传递，
  * 作为返回值，被赋值和赋值给变量等
  *
  * 补充：整个IT编程技术的发展史就是一部封装史
  * 1，在C语言中提供了函数的概念，用函数把若干条语句进行封装和复用
  * 2，在C++和Java等语言中提供了类和实现，把数据和处理数据的业务逻辑封装起来
  * 3，框架时代，把数据、代码和驱动引擎封装起来
  *
  *
  * 关于函数初级入门的几个要点：
  * 1，def关键字来定义函数
  * 2，函数会自动进行类型推断来确定函数返回值的类型，如果函数名称和函数体之间没有等于号的话，则类型推断失效，此时函数是Unit类型
  * 3，函数的参数可以是函数
  *
  *
  */
object HelloFunctionalProgramming {

  def main(args: Array[String]): Unit = {
    println(hello("Tiffany", 18)) //函数的参数可以是函数

    println("fibonacci of 10 = " + fab(10))

    hello("Scala")

    hello(age = 28, name = "jasper") // 可以根据函数参数名称来赋值

    println("sum=" + sum(1, 2, 3, 4, 5, 6))
    println("sum=" + sum(1 to 6: _*)) // 变参数的语法是   : _*
    println("sumrecursive=" + sumrecursive(1 to 6: _*)) // 变参数的语法是   : _*

  }

  def hello(name: String, age: Int = 30) = {
    println("Hello,my name is " + name)
    println("Hello,my age is " + age)
  }

  def fab(n: Long): Long = {
    if (n <= 1) {
      1
    } else {
      fab(n - 2) + fab(n - 1)
    }
  }

  //可变参数
  def sum(numbers: Int*) = {
    var result = 0
    for (number <- numbers) result += number
    result
  }

  def sumrecursive(numbers: Int*): Int = {
    if (0 == numbers.length) {
      0
    } else {
      numbers.head + sumrecursive(numbers.tail: _*)
    }
  }

}
