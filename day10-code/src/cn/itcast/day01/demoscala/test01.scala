package cn.itcast.day01.demoscala

class Person(xname:String,xage:Int){
  val name = xname
  val age = xage
  var money = 100

  /**
    * 重写构造器，必须调用类默认的构造器
    * @param xname
    * @param xage
    * @param xmoney
    */
  def this(xname:String,xage:Int,xmoney:Int){
    this(xname,xage)
    money = xmoney
  }
}

object test01 {
  def main(args: Array[String]): Unit = {
    val person = new Person("lisi",20)


  }
}
