val d = Map("Joe" -> "Sales")
case class Employee(name: String, department: String)
def lookupByName(name: String): Option[Employee] = Option(
  Employee(name, d.getOrElse(name, ""))
)

Option(Employee("Joe", "Sales")).map(_.department)
val a: Option[Int] = Some(1)
val b = None

case class ToDouble(value: Double)
case object ToDouble:
  def apply(i: Int): ToDouble = apply(i.toDouble)
  def apply(s: String): ToDouble = apply(s.toDoubleOption.getOrElse(0.0))

val x: Double = 1
