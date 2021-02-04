object zad1
{
	def main(args: Array[String]): Unit =
	{
		val myLunch =  new Sandwitch with Butter with Salad with Egg with Mayonaise
		
		val yourLunch = new Sandwitch with Ham
		
		println(myLunch.price)
		println(myLunch.content)
	}
	
}
