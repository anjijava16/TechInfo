package com.companion.constor

object ConstructorObject {
  
  
  def main(args: Array[String]): Unit = {
    
  /*  var ref=new ConstrorClass(); // Calling Default
    ref.operation("");
    */
    
    
    var ref=new ClassConstrorWithArg("karithk",10,"Noida");  //Paramater Constr
    ref.myMethod();
    
    
  }
}