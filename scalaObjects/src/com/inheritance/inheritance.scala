package com.inheritance

object inheritance {

  def main(args: Array[String]): Unit = {

    var subClassRef = new Example02();
    subClassRef.operation2();
    subClassRef.operation1();
    
    println(subClassRef.balance);
  }
}