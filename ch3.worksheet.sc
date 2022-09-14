val x = 1_000

Integer.parseInt("10", 2)

Integer.parseInt("11", 2)

3.toBinaryString

"one".toIntOption.getOrElse(0)

def makeInt(s: String) = s.toInt

//def makeInt(s: String): Option[Int] = {
//  try Some(s.toInt)
//  catch case e: NumberFormatException => None
//}

import scala.util.Try

def toInt(s: String) = Try(s.toInt).toOption

toInt("1")

import scala.util.{Try, Success, Failure}
def makeInt3(s: String): Try[Int] = Try(s.toInt)

makeInt3("a")

@throws(classOf[NumberFormatException])
def makeInt4(s: String) = s.toInt

val xx = 2.0

val d: Double = 65_535.0
d.isValidByte
d.asInstanceOf[Int]

val x2 = null.asInstanceOf[String]
println(x2)

case class A(v: Int) {
  def unary_! = -v
}

!A(3)

implicit class Sum(a: Int) {
  def ++(b: Int) = this.a + 2 * b
}

2 ++ 6

(5.0 - 3.0).abs

def ~=(x: Double, y: Double, tolerance: Double): Boolean = {
  if ((x - y).abs < tolerance) true else false
}

import scala.util.Random

def getRand[A](list: Seq[A], random: Random = new Random): A = list(
  random.nextInt(list.length)
)

getRand(List("a", "b", "c"))
