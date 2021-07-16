package jul16.demo1

object Ifuncation {
  def main(args: Array[String]): Unit = {

//    def getMax(a:Int, b:Int) :Int = {
//      if(a>b) a else b
//    }
//    println(getMax(1, 3))

    def f1(num :Int) :Int = {
      if (num == 1)
        num
      else
        num * f1(num-1)
    }
    print(f1(5))

  }

}
