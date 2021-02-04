abstract class Shape(var center: (Int, Int), var size: Int)
{
	override def toString(): String = " At " + center
}


class Triangle(center: (Int, Int), size: Int, var rotation: Int) extends Shape(center = center, size = size)
{
	override def toString: String = "Triangle of side size " + size + " rotation " + rotation + super.toString
	
}

object Triangle
{
	def apply(center: (Int, Int), rotation: Int, size: Int): Triangle = new Triangle(center, size, rotation)
}

class Square(center: (Int, Int), size: Int) extends Shape(center = center, size = size)
{
	override def toString: String = "Square of size " + size + super.toString
}

object Square
{
	def apply(center: (Int, Int), size: Int): Square = new Square(center, size)
}

class ColorTriangle(center: (Int, Int), size: Int, rotation: Int, var color: (Int, Int, Int)) extends Triangle(center = center, rotation = rotation, size = size)
{
	def setColor(r: Int, g: Int, b: Int): Unit = color = (r, g, b)
	def red: Int = color._1
	def green: Int = color._2
	def blue: Int = color._3
	
	def increaseRedBy(x: Double): Unit =
	{
		val newColor = if (color._1 + color._1 * x > 255) 255
		else color._1 + color._1 * x
		color = color.copy(_1 = newColor.toInt)
	}
	def increaseGreenBy(x: Double): Unit =
	{
		val newColor = if (color._2 + color._2 * x > 255) 255
		else color._2 + color._2 * x
		color = color.copy(_2 = newColor.toInt)
	}
	def increaseBlueBy(x: Double): Unit =
	{
		val newColor = if (color._3 + color._3 * x > 255) 255
		else color._3 + color._3 * x
		color = color.copy(_3 = newColor.toInt)
	}
	
	def decreaseRedBy(x: Double): Unit =
	{
		val newColor = if (color._1 - color._1 * x > 255) 255
		else color._1 - color._1 * x
		color = color.copy(_1 = newColor.toInt)
	}
	def decreaseGreenBy(x: Double): Unit =
	{
		val newColor = if (color._2 - color._2 * x > 255) 255
		else color._2 - color._2 * x
		color = color.copy(_2 = newColor.toInt)
	}
	def decreaseBlueBy(x: Double): Unit =
	{
		val newColor = if (color._3 - color._3 * x > 255) 255
		else color._3 - color._3 * x
		color = color.copy(_3 = newColor.toInt)
	}
	
	
	override def toString: String = super.toString + " with color r: " + color._1 + " g: " + color._2 + " b: " + color._3
	
	
}

object ColorTriangle
{
	def apply(center: (Int, Int), size: Int, rotation: Int, color: (Int, Int, Int)) = new ColorTriangle(center, size, rotation, color)
}

class ColorSquare(center: (Int, Int), size: Int, var color: (Int, Int, Int)) extends Square(center = center, size = size)
{
	def setColor(r: Int, g: Int, b: Int): Unit = color = (r, g, b)
	def red: Int = color._1
	def green: Int = color._2
	def blue: Int = color._3
	
	
	def increaseRedBy(x: Double): Unit =
	{
		val newColor = if (color._1 + color._1 * x > 255) 255
		else color._1 + color._1 * x
		color = color.copy(_1 = newColor.toInt)
	}
	def increaseGreenBy(x: Double): Unit =
	{
		val newColor = if (color._2 + color._2 * x > 255) 255
		else color._2 + color._2 * x
		color = color.copy(_2 = newColor.toInt)
	}
	def increaseBlueBy(x: Double): Unit =
	{
		val newColor = if (color._3 + color._3 * x > 255) 255
		else color._3 + color._3 * x
		color = color.copy(_3 = newColor.toInt)
	}
	
	
	def decreaseRedBy(x: Double): Unit =
	{
		val newColor = if (color._1 - color._1 * x > 255) 255
		else color._1 - color._1 * x
		color = color.copy(_1 = newColor.toInt)
	}
	def decreaseGreenBy(x: Double): Unit =
	{
		val newColor = if (color._2 - color._2 * x > 255) 255
		else color._2 - color._2 * x
		color = color.copy(_2 = newColor.toInt)
	}
	def decreaseBlueBy(x: Double): Unit =
	{
		val newColor = if (color._3 - color._3 * x > 255) 255
		else color._3 - color._3 * x
		color = color.copy(_3 = newColor.toInt)
	}
	
	
	override def toString: String = super.toString + " with color r: " + color._1 + " g: " + color._2 + " b: " + color._3
	
}

object ColorSquare
{
	def apply(center: (Int, Int), size: Int, color: (Int, Int, Int)) = new ColorSquare(center, size, color)
}

class Color(r: Int, g: Int, b: Int)
{

}