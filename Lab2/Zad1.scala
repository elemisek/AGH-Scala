object Zad1
{
	def main(args: Array[String]): Unit =
	{
		val n = if(args.size==0) 50 else args.head.toInt
		
		generateNumbers(n)
	}
	
	def generateNumbers(N: Int): Unit =
	{

		val g = for
			{i <- 1 to N if Math.sqrt(i) % 1 != 0} yield i
		println(g)
		
		
		
		/*
		for (i <- 1 to N if Math.sqrt(i) % 1 != 0)
		{
			print(s"$i ")
		}
		*/
	}
}
