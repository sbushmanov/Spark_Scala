import scala.collection.mutable.ListBuffer

def primary(upTo: Int): List[Int] = {
  val primes = ListBuffer[Int]()
  val candidates = Array.fill(upTo + 1)(true)
  for (i <- 2 to upTo) {
    if (candidates(i)) {
      primes += i
      for (j <- (i * 2) to upTo by i) {
        candidates(j) = false
      }
    }
  }
  primes.toList
}

val lst = List(1, 2, 3, 4, 5)

val primes: LazyList[Int] = 2 #:: LazyList.from(3).filter { c =>
  val primesSqrt = primes.takeWhile(_ <= math.sqrt(c))
  !primesSqrt.exists(c % _ == 0)
}

primes.take(10).force
