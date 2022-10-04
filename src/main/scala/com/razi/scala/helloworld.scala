package com.razi.scala

object username {
  def name(): Unit = {
    println("Razi")
  }


  def compute(num1: Int, num2: Int): Int = {
    if (num1 == num2) (num1 + num2) * 3 else num1 + num2
  }

  def abs_diff(num1:Int) : Int = {
    if (num1 > 51) (num1 - 51)*3 else (num1 - 51)
  }

  def max(num1: Int, num2: Int)={
    if (num1 > num2) num1+1 else num2+3
  }

  def main(args: Array[String]): Unit = {
    println("Welcome")
    username.name()
    println("Result =" + username.compute(4, 5));
    println("Result =" + username.compute(5, 5));
    println("Result =" + username.abs_diff(5));
    println("Biggest =" + username.max(5, 10));
  }
}



