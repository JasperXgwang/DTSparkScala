package com.dtspark.scala.basics

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
  * 集合
  */
object HelloArrayOps {

  def main(args: Array[String]): Unit = {

    val array = new Array[Int](5) // 固定长度
    array(0) = 10
    //    array(5) = 1  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
    for (item <- array) println(item)

    val array2 = Array[Int](1, 2, 3, 4, 5) // 常用创建数据方式
    for (item <- array2) println(item)

    val array3 = Array.apply(1, 2, 3, 4, 5)
    for (item <- array3) println(item)

    val names = Array("Scala", "Kafka", "Spark") // 不可变集合
    for (item <- names) println(item)

    val arrayBuffer = ArrayBuffer[Int]() // 默认都是在末尾增加元素，效率高
    arrayBuffer += 1
    arrayBuffer += 2
    arrayBuffer += 3
    arrayBuffer += (4, 5, 6)
    arrayBuffer ++= Array.apply(1, 2, 3)
    arrayBuffer.insert(arrayBuffer.length - 1, 100, 1000)
    arrayBuffer.toArray //多线程并发，可以转为array 不可变
    for (item <- arrayBuffer) println(item)

    for (i <- 0 until array.length) println(array(i) + " ")

    println("Sum=" + array2.sum)
    println("Max=" + array2.max)

    Sorting.quickSort(array2) //对数组升序排序
    println(array2.mkString("start----", ",", "-----end")) //转为str输出

    val arrayAddOne = for (item <- array2) yield item + 1 //将每个元素做特定操作生成新的集合
    println(arrayAddOne.mkString("start----", ",", "-----end")) //转为str输出
    println(array2.mkString("start----", ",", "-----end")) //转为str输出

    val arrayEven = for (item <- array2 if item % 2 == 0) yield item //获取集合偶数
    println(arrayEven.mkString("start----", ",", "-----end")) //转为str输出

    println(array2.filter { x => x % 2 == 0 }.mkString(" ")) // 可以通过丰富的算子做操作
    println(array2.filter {
      _ % 2 == 0
    }.mkString(" "))


  }

}
