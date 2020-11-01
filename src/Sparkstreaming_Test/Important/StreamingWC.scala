import org.apache.spark.{HashPartitioner, SparkConf}
import org.apache.spark.streaming.dstream.DStream
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * 实现按批次累计的功能，实现wordcount
  */

object StreamingWC {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("StreamingWC").setMaster("local[2]")
    val ssc = new StreamingContext(conf,Seconds(5))

    ssc.checkpoint("hdfs://master:9000/ck-20170925")

    val dStream = ssc.socketTextStream("192.168.136.130",8888)

    val tuples: DStream[(String,Int)] = dStream.flatMap(_.split(" ")).map((_,1))

    //按批次累加需要调用updateStateByKey方法
    val res: DStream[(String, Int)] = tuples.updateStateByKey(func, new HashPartitioner(ssc.sparkContext.defaultParallelism),false)

    res.print()
    ssc.start()
    ssc.awaitTermination()
  }

  val func = (it: Iterator[(String,Seq[Int],Option[Int])]) => {
    it.map(t => {
      (t._1,t._2.sum + t._3.getOrElse(0))
    })
  }

}
