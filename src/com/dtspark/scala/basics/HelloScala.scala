package com.dtspark.scala.basics


/**
  *
  * object 作为Scala中的一个关键字，相当于Java中的 public static class这样的一个修饰符，
  * 也就是说object中的成员都是静态的，所以我们在这个例子中的main方法都是静态的，
  * 不需要类的实例就可以被虚拟机调用，而这正是作为JVM平台上程序入口的必备条件；
  * 疑问：object是不是一个对象（此时，你肯定是从java的角度考虑的），事实上object是Scala中的静态类，不是对象
  *
  */
object HelloScala {

  /**
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("Hello Scala") // 在console 上打印出“Hello Scala”
    println(args.length)
  }

}
