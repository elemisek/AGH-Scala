import scala.util.Random

object Zad2
{
	def main(args: Array[String]): Unit =
	{
		val n = 1_000_000
		monteCarlo(n)
		
	}
	
	
	def monteCarlo(n: Int): Unit =
	{
		val g = new Random()
		println((for
			{i <- 0 to n if randDistance(g) < 1} yield i).size * 4.0 / n)
		
	}
	
	
	def randDistance(g: Random): Double = Math.pow(g.nextDouble, 2) + Math.pow(g.nextDouble, 2)
	
}
