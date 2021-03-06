package com.spark.demo.C03

import org.apache.spark.{SparkConf, SparkContext}

object Repartition {
  def main(args: Array[String]) {
    val conf = new SparkConf() //创建环境变量
      .setMaster("local") //设置本地化处理
      .setAppName("Repartition ") //设定名称
    val sc = new SparkContext(conf) //创建环境变量实例
    var arr = sc.parallelize(Array(1, 2, 3, 4, 5, 6)) //创建数据集
    arr = arr.repartition(3) //重新分区
    println(arr.partitions.length)
    arr.foreach(println)
  } //打印分区数
}
