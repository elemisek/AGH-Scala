object zad1
{
	def main(args: Array[String]): Unit =
	{
		println( pi ) // 3.1415
		println( pi(pi) ) // 9.86902225
		println( pi(pi(pi)) ) // 31.003533398375
		println(repN(5,  (x: Int) => 2*x , 1 )) //32
		// repeat function application N times i.e. f(f(f(f(f(1))))), 1 is the argument of the first invocation,
		
		printarg(arg="hello") // hello
	    printarg() // -
		  
	  }
	def pi = math.Pi
	
	def pi(piArg: Double): Double = piArg * pi
	
	@scala.annotation.tailrec
	def repN(times: Int, f: Int => Int, firstArg: Int): Int =
	{
		if(times==0) firstArg else repN(times - 1, f, f(firstArg))
	}
	
	def printarg(arg: => String = "-") : Unit = println(arg)
	
	
}
