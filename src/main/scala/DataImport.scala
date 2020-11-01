import java.io.BufferedOutputStream

import org.apache.hadoop.fs.{FileSystem, Path}
import org.apache.spark._

object DataImport {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("yarn")
    conf.set("spark.app.name", "MedicalQA")
    val sc = new SparkContext(conf)

    val sentence = "some words"

    val fs = FileSystem.get(sc.hadoopConfiguration)
    val output = fs.create(new Path("/test/somewords.txt"))
    val ops = new BufferedOutputStream(output)
    ops.write(sentence.getBytes("UTF-8"))
    ops.close()
    output.close()
    fs.close()
  }
}
