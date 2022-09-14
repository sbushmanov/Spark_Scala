trait Pet:
  def hasName(name: String): Unit

trait Legs:
  def hasLegs(n: Int): Int

abstract class Dog extends Pet

class Dog2(n: Int, name: String) extends Dog, Legs:
  val legs = hasLegs(n)
  def hasLegs(n: Int) = n
  def hasName(name: String): Unit = println(name)

trait PizzaTrait:
  def maxNumToppings: Int

class SmallPizza extends PizzaTrait:
  val maxNumToppings = 4

trait HasLegs:
  def legs(n: Int): Int = n
trait HasTail:
  def tail(n: Int): Int = n
trait MansBestFriend
class Pet2(val name: String)

val zeus = new Pet2("Zeus") with HasTail with HasLegs
zeus.legs(4)

trait Greeter:
  def greet = "Hi"

class MyGreeter extends Greeter

val g = MyGreeter()

g.greet

trait Parent:
  def speak = "make your bed"
trait Granddad:
  def speak = "get off my lawn"

class Speaker extends Parent, Granddad:
  override def speak = super.speak

val s = Speaker()
s.speak
