package com.companion

class CompObjectClass {

  def sayWork(): Unit = {

    println("Comapnion Object");
  }
}
// Companion Object
object CompObject {

  def main(args: Array[String]): Unit = {

    /*var ref = new CompObjectClass();
    ref.sayWork();
 */
    
    //Anonomys Class Creation here
  new CompObjectClass().sayWork();
   
  
  }
}