package com.dtspark.scala.basics

/**
  * Scala中的基本控制结构语法
  */
object ControlStructures {

  def main(args: Array[String]): Unit = {
    println("Scala")

    /**
      * if条件表达式会根据if括号里面的boolean值来决定整个if表达式的值
      *
      * 1，Scala中的if条件表达式是有值的！！！这个Java是不一样的
      *
      * 2，if 条件表达式中可以进行类型推导，类型推导的一般过程中就是根据变量的类型来推导确定变量的类型，这就在很多复杂的算法
      * 实现的时候可以让我们省略掉变量的类型书写，为复杂算法的实现提供了非常大的便利
      *
      * 3, 如果if后面没有else部分，默认的实现是 if(....) .... else ()，提倡为 else NONE
      * 这种方式的目的是为了确保if条件表达式的类型为处理逻辑需要的类型Option，而不是Any类型，为下一步的处理打下基础
      *
      * 4，if表达式中如果有多条语句，可以使用{}包裹起来，但是这里就是有一个问题了，{}中的多条语句，哪一条是计算结果呢,
      * 是{}中的最后一条
      *
      * 5，补充说明，{...} 代表了一个语句块，语句块是有值的，值就是最后一条语句，类型是最后一条语句的类型
      *
      */
    var age = 10
    val result = if (age > 25) "Worker" else "Student" //此时因为Worker 和Student都是字符串的，所以result也是字符串类型的
    println(result)

    val result2 = if (age > 18) "Adult" else 1 // result2类型是两者的公共父类 Any
    println(result2)

    val result3 = if (age > 18) "Adult" else None
    println(result3)

    var x, y = 0
    val result4 = if (age < 18) {
      x = x + 1
      y = y + 1
      x + y
    } else 0
    println(result4)


    /**
      * for循环是不断的循环一个集合，然后for循环后面的{....}代码部分会根据for循环(....)里面提取的集合item来作为{....}的输入流程控制
      *
      * 1,for循环中加入的if叫做条件守卫，用于限制for循环(优化for循环，去掉不必要的执行步骤，或者说用于跳出for循环)
      *
      * 2,在for循环中能够提取出什么内容取决于后面的集合类型
      *
      * 3,想跳出for循环的话，除了加入if守卫以外，还可以使用return关键字
      */

    for (i <- 0 to 5 if i % 2 == 0) {
      println(i)
    }

    var flag = true
    var sum = 0
    for (i <- 0 to 6 if flag) {
      sum = sum + i
      if (i == 5) flag = false
    }
    println("sum = " + sum)

    sum = 0
    for (i <- 0 to 6 if flag) {
      sum = sum + i
      if (5 == i) return //return 返回是方法级别的
    }
    println("sum with return = " + sum)

    for (item <- "Hello Spark".split(" ")) println(item)






  }

}
