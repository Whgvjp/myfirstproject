package jul16.demo1

object TetsMap {
  def main(args: Array[String]): Unit = {
    val map = Map("name" -> "lisi", "age" -> 18, ("money", 1000))
//    map.foreach(println)
//    val values: Iterable[Any] = map.values
//    values.foreach(println)
//    val set: Set[String] = map.keySet
//    set.foreach(println)

    val option = map.get("name")
    println(option)
    println(option.get)
  }

}
