val fruits = List("apple", "banana", "orange")

for fruit <- fruits do println(fruit)

for i <- 0 until fruits.length do println(s"$i is ${fruits(i)}")

for (fruit, index) <- fruits.zipWithIndex do println(s"$index is $fruit")

for (fruit, index) <- fruits.zipWithIndex yield (index -> fruit)

case class Dog(name: String)

def test(x: Matchable): String = x match {
  case x: Dog       => "found Dog class"
  case Dog("kuzya") => "found Dog kuzya"
}

test(Dog("kuzya"))

def listToString(list: List[String]): String = list match
  case Nil       => ""
  case s :: rest => s + " " + listToString(rest)

listToString(fruits)

def sumList(lst: List[Int]): Int = lst match {
  case Nil       => 0
  case n :: rest => n + sumList(rest)
}

sumList(List(0, 1, 2))

List(Nil) == Nil
