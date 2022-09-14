val x = 3
val y = x + 3
val z = List(1, 2, 3)
z.toArray
val t = (1, 3.0, "arr")
t.getClass()
Seq("arr").toList
Seq("a").toList

val s = "  Scalla is hell"

val tu = s
  .groupBy(identity)
  .map(x => x._1 -> x._2.size)
  .toSeq
  .sortBy(_._1)(Ordering[Char].reverse)

s.count(x => x == 'l')

s.sorted

s.sortWith((x, y) => x < y)

s.dropWhile(x => x != ' ')

s.dropWhile(x => x == ' ')

"abc def".dropWhile(x => x != ' ')

"abc def".takeWhile(x => x != ' ')

s.foreach[Unit](x => println(x))

"scala".drop(2)

scala.util.Properties.versionNumberString

val aa = Nil.length

val xx: Option[Int] = None
val yy: Option[Int] = Some(2)

xx.getOrElse(0)

val ss = """
|first
| second
| third
""".stripMargin

import scala.util.matching.Regex

val reg = new Regex("\\p{Digit}+")
val address = "123 street"
val firstMatch = reg.findFirstIn(address)
firstMatch.getOrElse("")

address.replaceAll("\\p{Digit}", "x")
address.replaceAll("\\d", "x")
address.replaceAll("\\d+", "x")

address.replaceAll(raw"(\d)", "x")

val r = new scala.util.Random
r.nextString(10)

r.alphanumeric.take(10)

r.alphanumeric.take(10).mkString

r.alphanumeric.take(3).mkString
