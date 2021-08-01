package jul16.demo1

object TestCase {

//  implicit val address:String = "nanjing"
  implicit val age:Int = 15

  def test1(implicit name:String="ZS") = {
    println(name)
  }

  def main(args: Array[String]): Unit = {
    test1("lisi")
    test1()
    test1

  }
}
