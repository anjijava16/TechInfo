package com.methodOverloading

class MethehodOverloadingClass {

  def operationOne(x: Int): Unit = {

    println(" x value =" + x);
  }

  def operationOne(x: Int, y: Int): Unit = {

    println(" x value & y value =" + x + y);
  }

  def operationOne(x: Double): Unit = {
    println("Double x" + x);
  }
  
  def operationOne(name: String): Unit = {
    println("Name is " + name);
  }
}
