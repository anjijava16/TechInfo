package com.methodOverloading

object MethodObject {
  
  
  def main(args: Array[String]): Unit = {
    
    
    var ref=new MethehodOverloadingClass();
    
    ref.operationOne("anji");
    ref.operationOne(10);
  }
}