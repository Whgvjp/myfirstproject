import kafka.serializer.StringDecoder
import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}

object KafkaDirect {
  Logger.getLogger("org").setLevel(Level.WARN)
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("KafkaDirect").setMaster("local[2]")
    val ssc = new StreamingContext(sparkConf, Seconds(5))

    val messages = KafkaUtils.createDirectStream[String,String,StringDecoder,StringDecoder](ssc,Map("metadata.broker.list"->"master:9092"),Set("kafka_streaming_topic"))

    messages.map(_._2).flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_).print()

    ssc.start()
    ssc.awaitTermination()

  }
}