import java.util.regex.Pattern

import StreamingWC.func
import org.apache.spark.{HashPartitioner, SparkConf}
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.dstream.DStream

object StreamingJSON {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("StreamingJSON").setMaster("local[2]")
    val ssc = new StreamingContext(conf, Seconds(5))

    //数据格式
    val a = """{"click_count":6,"event_time":"1529030354244","ip":"123.235.242.27","os_type":"Android","uid":"4A4D769EB9679C054DE81B973ED5D768"}"""

    val dStream = ssc.socketTextStream("192.168.136.130", 8888)
    val p3 = Pattern.compile("""(\S+) (.+) \[(.+)\] "(\S+) (\S+) (\S+)" (\d+) (\d+) "(\S+)" "(.+)"""")





    ssc.start()
    ssc.awaitTermination()
  }

}
