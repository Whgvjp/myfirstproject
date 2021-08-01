package jul16.demo1
import org.apache.spark.sql.SparkSession


object TestSpark {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("Spark SQL basic example")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()

    val df = spark.read.json("D:\\people.json")
    df.show()

  }

}
