abstract class Food
{
	def price(): Int
	
	def content(): List[String]
}

class Sandwitch extends Food
{
	override def price() : Int = 5
	override def content() : List[String] = List("Sandwitch")
	
}

trait Butter extends Food
{
	abstract override def price(): Int = 1 + super.price()
	abstract override def content(): List[String] = super.content() :+ "Butter"
}

trait Salad extends Food
{
	abstract override def price(): Int = 1 + super.price()
	abstract override def content(): List[String] = super.content() :+ "Salad"
}

trait Egg extends Food
{
	abstract override def price(): Int = 1 + super.price()
	abstract override def content(): List[String] = super.content() :+ "Egg"
}

trait Mayonaise extends Food
{
	abstract override def price(): Int = 1 + super.price()
	abstract override def content(): List[String] = super.content() :+ "Mayonaise"
}

trait Ham extends Food
{
	abstract override def price(): Int = 1 + super.price()
	abstract override def content(): List[String] = super.content() :+ "Ham"
}

trait Cheese extends Food
{
	abstract override def price(): Int = 1 + super.price()
	abstract override def content(): List[String] = super.content() :+ "Cheese"
}

class ChefsBest extends Sandwitch with Butter with Salad with Ham with Cheese
