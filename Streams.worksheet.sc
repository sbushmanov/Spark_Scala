Stream(1, 1, 2, 3)
val streamFib: Stream[Int] =
  1 #:: 1 #:: streamFib.zip(streamFib.tail).map(_ + _)

streamFib(10)

LazyList(1, 1) ++ LazyList(2, 2)

0 #:: LazyList.empty
