object PESELExtr
{
	def unapply(pesel: String): Option[(Int, Int, Int, Char)] =
	{
		val year: Int = 1900 + pesel.take(2).toInt
		val month: Int = pesel.slice(2, 4).toInt
		val day: Int = pesel.slice(4, 6).toInt
		val sex: Char = if(pesel(pesel.length-2)%2==1) 'M' else 'F'
		val weights = List(1, 3, 7, 9, 1, 3, 7, 9, 1, 3)
		val p = pesel.map(_.asDigit).dropRight(1)
		try
		{
			val sum: Int = (for(i <- p.indices) yield p(i)*weights(i)).sum
			if(10-(sum%10)+'0'!=pesel(pesel.length-1)) throw new Exception("Wrong checksum")
		}
		catch
		{
			case e: Exception => println(e)
		}
		Option(year, month, day, sex)
	}
}