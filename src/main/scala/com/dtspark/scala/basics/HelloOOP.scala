package com.dtspark.scala.basics

/**
  *
  *         /*
                           _ooOoo_
                          o8888888o
                          88" . "88
                          (| -_- |)
                          O\  =  /O
                       ____/`---'\____
                     .'  \\|     |//  `.
                    /  \\|||  :  |||//  \
                   /  _||||| -:- |||||-  \
                   |   | \\\  -  /// |   |
                   | \_|  ''\---/''  |   |
                   \  .-\__  `-`  ___/-. /
                 ___`. .'  /--.--\  `. . __
              ."" '<  `.___\_<|>_/___.'  >'"".
             | | :  `- \`.;`\ _ /`;.`/ - ` : | |
             \  \ `-.   \_ __\ /__ _/   .-` /  /
        ======`-.____`-.___\_____/___.-`____.-'======
                           `=---='
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                 佛祖保佑       永无BUG
  */
  * 1，在Scala中定义类是用class关键字
  * 2，可以使用new Class的方式来构建对象
  * 3，object中的apply是class对象生产的工厂方法，用于控制对象的生成
  */
class HelloOOP {
  var name = "Spark"

  def sayHello = println("Hi, My name is " + name)

}


object HelloOOP {

  def main(args: Array[String]): Unit = {
    println("Hello Scala OOP>>>>>")

    val helloOOP = new HelloOOP
    helloOOP.sayHello

    val helloOOP2 = HelloOOP.apply()
    helloOOP2.sayHello
  }

  def apply(): HelloOOP = {
    new HelloOOP()
  }
}












