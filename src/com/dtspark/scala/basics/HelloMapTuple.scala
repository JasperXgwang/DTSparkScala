package com.dtspark.scala.basics

import scala.collection.{SortedMap, mutable}


/**
  * 1，默认情况下map是不可变的集合
  * 2，map的实例是调用工厂方法模式apply来构造的
  *
  *
  */
object HelloMapTuple {

  def main(args: Array[String]): Unit = {

    val bidDatas = Map("Spark" -> 16, "Hadoop" -> 11)
    //    bidDatas("Spark") = 17

    val programingLanguage = scala.collection.mutable.Map("Scala" -> 13, "Java" -> 23)
    programingLanguage("Scala") = 15

    for ((name, age) <- programingLanguage) println(name + "  " + age)
    println(programingLanguage.getOrElse("Python", "empty")) //查询某个值

    //可变map
    val personsInfoMation = new mutable.HashMap[String, Int]
    personsInfoMation += ("Spark" -> 16, "Hadoop" -> 11)
    personsInfoMation -= ("Spark")
    for ((language, years) <- personsInfoMation) println(language + "  " + years)
    for (key <- personsInfoMation.keySet) println(key)
    for (value <- personsInfoMation.values) println(value)

    //排序
    println(SortedMap(("12", "a"), ("1", "b")))


    //Tuple中可以有多种数据类型
    val info = ("jasper", "male", 18, "like scala")
    println(info)
    println(info._4)

  }

}
