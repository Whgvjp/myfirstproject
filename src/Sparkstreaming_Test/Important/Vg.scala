import java.util.regex.Pattern

object Vg {
  def main(args: Array[String]): Unit = {
    val p3 = Pattern.compile("""(\S+) (.+) \[(.+)\] "(\S+) (\S+) (\S+)" (\d+) (\d+) "(\S+)" "(.+)"""")
    val str = """10.1.1.95 - - [18/Mar/2005:12:21:42 +0800] "GET /stats/awstats.pl?config=e800 HTTP/1.1" 200 899 "http://10.1.1.1/pv/" "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; Maxthon)""""

    val m1 = p3.matcher(str)
    if (m1.matches) {
      for (i <- 0 to m1.groupCount())
        println("group(" + i + ")  = " + m1.group(i))
    }else {
      println("a")
    }
  }
}
