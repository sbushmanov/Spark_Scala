case class Person(name: String, age: Int)

val p1 = Person("Sergey", 52)
val p2 = Person("Dasha", 10)

p1 match { case Person(n, a) => println(s"name is $n, age is $a") }

List(p1, p2).collect { case Person(n, a) if a > 50 => (n, a) }

def findMe(lst: List[Person]): List[Person] = lst match {
  case Nil                             => Nil
  case t :: tail if t.name == "Sergey" => t :: findMe(tail)
  case t :: tail                       => findMe(tail)
}

findMe(List(p1, p2))
