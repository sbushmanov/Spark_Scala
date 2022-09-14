import scala.collection.mutable.ListBuffer
List.fill(3)("foo")
List.tabulate(5)(identity)
val a = List.tabulate(5)(x => if (x % 2 == 0) x else None)
a.collect { case x: Int => x }

List.tabulate(5)(identity).collect { case x if (x % 2 == 0) => x }
List(1) ++ List(2)
List(1) +: List(2)

ListBuffer(1) ++ ListBuffer(2)
val b = ListBuffer(1)
b += 2

List(1, 2, 3).sum
