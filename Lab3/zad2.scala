object zad2
{
	def main(args: Array[String]): Unit =
	{
		
		val sum1 = sumfrac(1e-3)
		val sum2 = sumfrac(1e-9)
		
		println(sum1)
		println(sum2)
		
	}
	
	def sumfrac(n: Double): Double =
	{
		@scala.annotation.tailrec
		def sum(fracSum: Double = 0, frac: Double = 1): Double = if (frac < n) fracSum
		else sum(fracSum + frac, frac / 2.0)
		
		sum()
	}
	
	
	/*
	def sumfrac(n: Double, frac: Double = 1) : Double =
	{
		
		@scala.annotation.tailrec
		def sum(n: Double, frac: Double, fracSum: Double): Double = if (frac < n) fracSum
		else sum(n, frac / 2.0, frac / 2.0 + fracSum)
		
		sum(n, frac, 0)
	}
	 */
	
	
}
