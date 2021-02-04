trait Food
{
	override def toString: String = "Food"
}

abstract class Plants() extends Food
{
	override def toString: String = "Plants"
}

class Carrot() extends Plants
{
	override def toString: String = "Carrot"
}

trait Meat extends Food
{
	override def toString: String = "Meat"
}

abstract class Animal()
{
	type T <: Food
	
	def eat(obj: T)
}

class Rabbit() extends Animal with Meat
{
	override def toString: String = "Rabbit"
	
	override type T = Plants
	
	override def eat(obj: T): Unit = println(this + " crunches the " + obj)
}

class Wolf() extends Animal
{
	override def toString: String = "Wolf"
	
	override type T = Meat
	
	override def eat(obj: T): Unit = println(this + " tears apart the " + obj)
}