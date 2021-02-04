object zad2
{
	def main(args: Array[String]): Unit =
	{
		val people = List(("John", "Doe", 23, "male"), ("Joan", "Doe", 23, "female"), ("Steve", "Jenkins", 24, "male"), ("Eva", "Robinson", 25, "female"),
			("Ben", "Who", 22, "male"), ("Janet", "Reed", 21, "female"), ("Rob", "Jenkins", 26, "male"), ("Ella", "Dawson", 27, "female"))
		
		//println(people)
		//println(isJoeOrJohn(people))
		//print(everyoneOlderThan20(people))
		
	}
	
	def females(l: List[(String, String, Int, String)]): List[(String, String, Int, String)] = l.filter
	{
		case (_, _, _, sex) => sex == "female"
	}
	
	def males(l: List[(String, String, Int, String)]): List[(String, String, Int, String)] = l.filter
	{
		case (_, _, _, sex) => sex == "male"
	}
	
	def ageAbove23(l: List[(String, String, Int, String)]): List[String] = l.filter
	{
		case (_, _, age, _) => age > 23
	}.map(_._1)
	
	def isJoeOrJohn(l: List[(String, String, Int, String)]): Boolean = l.exists(_._1 == "John") || l.exists(_._1 == "Joe")
	
	def everyoneOlderThan20(l: List[(String, String, Int, String)]): Boolean = l.minByOption(_._3).map(_._3).get > 20
	
	def firstNameAndAge(l: List[(String, String, Int, String)]): Unit = l.foreach
		{
			case (name, _, age, _) => (name, age)
		}
	
	def groupByAge(l: List[(String, String, Int, String)]): Map[Int, List[(String, String, Int, String)]] = l.groupBy
	{ case (_, _, age, _) => age }
	
	def olderYoungerThan23(l: List[(String, String, Int, String)]): (List[(String, String, Int, String)], List[(String, String, Int, String)]) = l.partition
	{
		case (_, _, age, _) => age <= 23
	}
	
	def oldest(l: List[(String, String, Int, String)]) = l.maxByOption(_._3)
	
	def youngest(l: List[(String, String, Int, String)]) = l.minByOption(_._3)
	
	def malesAndFemales(l: List[(String, String, Int, String)]) = l.count
	{ case (_, _, _, sex) => sex == "female" } == l.count
	{ case (_, _, _, sex) => sex == "male" }
	
	def sortedAbove23(l: List[(String, String, Int, String)]) = l.dropWhile(_._3 <= 23).sortBy(_._3)
}
