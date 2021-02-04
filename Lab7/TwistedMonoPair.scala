class TwistedMonoPair[+T](val elem: (T, T))
{
	def apply(i: Int) = if(i==0) elem._1 else elem._2
	def replace[U >: T](i: Int)(obj: U) = if(i==0) new TwistedMonoPair[U](elem.copy(_1=obj)) else new TwistedMonoPair[U](elem.copy(_2=obj))
	override def toString = elem._1 + " " + elem._2
}

object TwistedMonoPair
{
	def apply[T](t: (T, T)): TwistedMonoPair[T] = new TwistedMonoPair(t)
}

class A
{
	override def toString: String = "A"
}

class B(val x: Int) extends A
{
	override def toString: String = "B:" + x.toString
}

class C(x: Int) extends B(x)
{
	override def toString: String = "C:" + x.toString
}