import scala.collection.mutable.ListBuffer

object zad2
{
	def main(args: Array[String]): Unit =
	{
		val data = List(Map("name" -> "Jan", "fname" -> "Kowalski", "age" -> "45"),
			
			Map("company" -> "ABB", "origin" -> "Sweden"),
			
			Map("name" -> "Katarzyna", "fname" -> "Nowak", "age" -> "45"),
			
			Map("company" -> "F4", "origin" -> "Poland"),
			
			List("Cos", "innego"),
			
			Map("company" -> "Salina Bochnia", "origin" -> "Poland"),
			
			Map("company" -> "AGH", "origin" -> "Poland"),
			
			Map("name" -> "Krzysztof", "fname" -> "Krol", "age" -> "14")
		
		)
		getCompanies(data)
	}
		
	
	def getCompanies(l: List[Any]) : Unit = print(filterCompanies(matchCompanies(l)))
	
	def matchCompanies(l: List[Any]): List[Any] =
	{
		l.map(_ match
		{
			case map: Map[String, String] =>
			{
				if ((map contains "company") && (map contains "origin"))
					new Company(map("company"), map("origin"))
			}
			case _ => Nil
		})
		
	}
	
	def filterCompanies(list: List[Any]): List[Company] = list.filter(_.isInstanceOf[Company]).asInstanceOf[List[Company]]
	
	
	case class Company(company: String, origin: String)
	
	
}