package com.packge.caseinfo

case class Operation(name: String, id: Int);

object CaseObject {

  def main(args: Array[String]): Unit = {

    var ref = new Operation("anji", 10);  //Setting input Values 

    
    
    // Getting Input Values 
    //ref=new Operation("",20);
    println("Name is " + ref.name);

    println("Id is " + ref.id);
  }
}