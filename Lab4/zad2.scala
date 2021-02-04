
object zad2 extends App
{
	
	case class MapPoint(s: String, x: Double, y: Double)
	{
		def getX() = x;
		
		def getY() = y;
		
		def getS() = s;
		
		override def toString: String =
		{
			val xName = getX() match
			{
				case x if (x > 0) => "N"
				case x if (x < 0) => "S"
				case 0 => ""
			}
			
			val yName = getY() match
			{
				case x if (x > 0) => "E"
				case x if (x < 0) => "W"
				case 0 => ""
			}
			
			s + " " + Math.abs(getX()) + xName + " " + Math.abs(getY) + yName
		}
		
		def distanceTo(other: MapPoint): Double = Math.sqrt(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2))
		
		def -(other: MapPoint): Double = distanceTo(other)
		
		def move(x: Double, y: Double): MapPoint = MapPoint("Nearby" + getS(), getX() + x, getY() + y)
		
	}
	
	def inTheMiddle(p1: MapPoint, p2: MapPoint, s: String): MapPoint = MapPoint(s, (p1.getX() + p2.getX()) / 2.0, (p1.getY() + p2.getY()) / 2.0)
	
	case class Route(p: MapPoint*)
	{
		var setP = p
		def addStop(p: MapPoint): Unit = setP = setP :+ p
		
		
		override def toString : String =
		{
			val pr = setP.reverse
			pr.mkString(" -> ")
		}
		
	}
	
	
	val krk = MapPoint("Krakow", 50.061389, 19.938333);
	
	println(krk);
	
	val nyc = MapPoint("NYC", 40.7127, -74.0059);
	
	println(nyc);
	
	val porto = MapPoint("Porto", 41.162142, -8.621953);
	
	val irkutsk = MapPoint("Irkutsk", 52.283333, 104.283333);
	
	println(irkutsk);
	
	
	
	println(porto - irkutsk)
	
	println(krk - irkutsk)
	
	println(krk.distanceTo(porto))
	
	
	val mp = inTheMiddle(krk, irkutsk, "Somwhere in Russia")
	
	println(mp + " " + (mp - krk) + " " + (mp - irkutsk))
	
	
	val r = Route(krk, nyc, porto)
	
	println(r);
	
	r.addStop(porto.move(1, 1))
	
	r.addStop(irkutsk)
	
	println(r)
	
}


/* expected result

Krakow 50.061389N 19.938333E

NYC 40.7127N 74.0059W

Irkutsk 52.283333N 104.283333E

113.45168353092112

84.37426183463258

29.914654160942675

Somwhere in Russia 51.172360999999995N 62.110833E 42.18713091731629 42.18713091731629

Porto 41.162142N 8.621953W -> NYC 40.7127N 74.0059W -> Krakow 50.061389N 19.938333E

Irkutsk 52.283333N 104.283333E -> Nearby Porto 42.162142N 7.6219529999999995W -> Porto 41.162142N 8.621953W -> NYC 40.7127N 74.0059W -> Krakow 50.061389N 19.938333E



 */