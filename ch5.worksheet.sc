enum Topping:
  case Cheese, Pepperoni, Sausage, Mushrooms, Onions

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Regular, Thin, Thick

case class Pizza(
  crustSize: CrustSize,
  crustType: CrustType,
  toppings: Seq[Topping]
)

case class Customer(name: String, phone: String, address: Address)

case class Address(
  street1: String,
  street2: Option[String],
  city: String,
  state: String,
  postalCode: String
)

case class Order(pizzas: Seq[Pizza], customer: Customer)

trait PizzaServiceInterface:
  def addTopping(p: Pizza, t: Topping): Pizza
  def removeTopping(p: Pizza, t: Topping): Pizza
  def removeAllToppings(p: Pizza): Pizza
  def updateCrustSize(p: Pizza, cs: CrustSize): Pizza
  def updateCrustType(p: Pizza, ct: CrustType): Pizza

trait PizzaService extends PizzaServiceInterface:
  def addTopping(p: Pizza, t: Topping): Pizza =
    val newToppings = p.toppings :+ t
    p.copy(toppings = newToppings)

0 +: List(1, 2)
