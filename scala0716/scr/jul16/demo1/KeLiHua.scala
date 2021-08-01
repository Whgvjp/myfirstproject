package jul16.demo1

object KeLiHua {
  def main(args: Array[String]): Unit = {
    def f7(a :Int, b :Int)(c :Int, d :Int) = {
      a+b+c+d
    }
    println(f7(1,2)(3,4))
  }

}
