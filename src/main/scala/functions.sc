import scala.io.StdIn.readLine

val str:String = "util.Properties.versionNumberString"
println(s"Scala Version is : $str")

object test_scala{
  def compute(num1:Int, num2:Int) : Int = {
    if (num1 == num2) (num1+ num2)*3 else num1 + num2
  }
}

def fact(num: Int): Int = {
    return (1 to num).reduce(_*_)
}


object test_scala1{
  def main(args: Array[String]): Unit={
    println("Result =" + test_scala.compute(4,5));
    println("Result =" + test_scala.compute(5,5));
    val z = fact(5)
    println(z)
    //arra = Array(1,3,4,5,6,7,233,67,74,22,56,883,3)
    //val pos = linearSearch(arra, 7)
    //if (pos == -1) "Not Found" else println(s"found at $pos")

    var x = readLine("Enter the first number")
    var y = readLine("Enter the second number")
    var z1 = x.toInt + y.toInt

    print("Sum of 2 nnumbers is {z}", z1)
  }
}


"""def linearSearch(arr:Array[Int], element: Int): Int={
  for(i<-0 until(arr.length))
    {
      if (arr[i] == element)
        return i
    }
    return -1
}
"""

// Take input from user


