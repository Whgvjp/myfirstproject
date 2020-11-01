import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * 使用spark streaming完成迄今为止所有累计单词的个数
  */
object StatefulWordcount {
  def main(args: Array[String]): Unit = {

    val sparkConf=new SparkConf().setAppName("StatefulWordcount").setMaster("local[2]")

    val ssc=new StreamingContext(sparkConf,Seconds(5))
    //如果使用了stateful的算子，必须要设置checkpoint
    //在生产过程中，建议把这个放到hdfs上
    //自己没设置，也没事
    ssc.checkpoint(".")

    val lines: ReceiverInputDStream[String] =ssc.socketTextStream("bigdata.ibeifeng.com",6789)
    val results: DStream[(String, Int)] =lines.flatMap( _.split(" "))
      .map((_,1))    //.reduceByKey(_+_)

    //val state: DStream[(String, Int)] =results.updateStateByKey[Int](updateFunction _)

    //state.print()

    ssc.start()
    ssc.awaitTermination()
  }
  //from:http://spark.apache.org/docs/2.1.0/streaming-programming-guide.html
  /**
    * 把当前的数据去更新已有的数据
    * @param CurrentValues 新的的
    * @param PreValues 以前的
    * @return
    */
  def updateFunction(CurrentValues: Seq[Int], PreValues: Option[Int]): Option[Int] = {
    val current = CurrentValues.sum //...  // add the new values with the previous running count to get the new count
    val pre=PreValues.getOrElse(0)
    Some(current+pre)
  }

}