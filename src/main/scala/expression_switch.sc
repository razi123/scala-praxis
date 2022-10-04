val x = 10
val myList = Array(1, 2, 3, 4)
var y = 22

val sum = myList.reduce(_+_)
val sum_even = myList.filter(_%2==0).reduce(_+_)
val sum_odd = myList.filter(_%2==1).reduce(_+_)

val exp_a = {
  val m = 10
  val n = 20
  val p = 30

  (m+n+p)/3.toFloat
}

val exp_b = {
  val a= 10;
  {
    val b = a * 10;
    {
      val c = b / 2;
      c.toFloat
    }
  }
}

var (name:String, age:Int, salary:Float) = Tuple3("Razi", 32, 100000f)
var (name:String, age:Int, salary:Float) = ("Khazi", 33, 1000000f)
var (name, age, salary) = ("Khazi", 33, 1000000f)

val data = ("Khazi", 33, 1000000f)
println(data._1)
println(data._2)
println(data._3)


val numbers = Tuple3(1,2,3)
println(numbers)


(65 to 90).foreach(num => print(num.toChar + " "))

val c:Char = 'A';
println(c)
val i = c
println(i.toInt)


Int.MaxValue
Int.MaxValue + 1
Byte.MaxValue
Byte.MaxValue + 1
Byte.MaxValue + 1.toByte
Byte.MaxValue + (1).toByte

val option = 4
var msg = option match {
  case 1 => "One"
  case 2 => "two"
  case 3 => println("Three"); "Three"
  case 4 => {println("Four in print 1")
             println("Four in print 2");
             "Four outside"}
  case other => s"$other is outside scope"
}

var num= 5

if (num%2==0) println(s"$num is Even") else println(s"$num is Odd")


var day:String = "mon"

day match {
  case "mon"|"tue"|"wed"|"thu"|"fri" => "Weekday"
  case "sat"|"sun" => "Weekend"
}

val result = if (10%2==1) "Odd" else "Even"
val result = if (11%2==1) "Odd"

val result = if (10%2==0) 10