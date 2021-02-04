object zad1
{
	
	def main(args: Array[String]): Unit =
	{
		println(filterList(List("Hello", "there", "people"), _.contains('p')))
		println(reverseList(List("Hello", "there", "people")))
	}
	
	def filterList(list: List[String], fun: (String) => Boolean): List[String] =
	{
		@scala.annotation.tailrec
		def filter(list: List[String], result: List[String]): List[String] =
		{
			list match
			{
				case Nil => result;
				case hd :: tl if (fun(hd)) => filter(tl, hd :: result)
				case hd :: tl => filter(tl, result)
			}
		}
		filter(list,List[String]())
	}
	
	def reverseList(list: List[String]): List[String] =
	{
		@scala.annotation.tailrec
		def reverse(list: List[String], result: List[String]): List[String] =
		{
			list match
			{
				case Nil => result;
				case hd :: tl => reverse(tl, hd:: result)
			}
		}
		reverse(list,List[String]())
	}
}

