object zad1
{
	def main(args: Array[String]): Unit =
	{
		//Following entities exist: Food, Carrot, Rabbit, Wolf, Meat, Plants, Animal.
		
		val c: Plants = new Carrot
		val r = new Rabbit
		
		val w = new Wolf
		
		// this two shold compile and run w/o problems
		
		r.eat(c)
		
		w.eat(r)
		//whereas these should not compile
		
		//r.eat(r)
		
		//w.eat(c)
		
			//Expected result:
		  
		    //Rabbit crunches the  Carrot
			
			//Wolf tears apart the Rabit
		
		
	}
}
