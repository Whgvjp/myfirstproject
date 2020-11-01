

import org.apache.spark.{SparkConf, SparkContext}


/*
object WordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("wordcount").setMaster("local")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("hdfs://master:8020/tmp/demo.txt")
    lines.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_+_).foreach(println _)
    sc.stop()
  }
}
*/
