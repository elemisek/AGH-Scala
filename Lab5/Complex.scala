class Complex(val x: Double, val y: Double)
{
	def +(that: Complex): Complex = new Complex(that.x + x, that.y + y)
	
	def -(that: Complex): Complex = new Complex(x - that.x, y - that.y)
	
	override def toString = "Re:{" + x + "} Im:{" + y + "}" //Re:{1.0} Im:{2.0}
	
	def angle: Double = Math.atan(y / x)
	
	def r: Double = Math.sqrt(x * x + y * y)
	
}


object Complex
{
	def apply(x: Double, y: Double): Complex = new Complex(x, y)
	
	def polar(angle: Double, r: Double): Complex = new Complex(r * Math.cos(angle), r * Math.sin(angle))
}
