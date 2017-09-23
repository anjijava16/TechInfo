package com.companion.constor

// Primay Constr
class AuxilioaryConstr(name: String, add: String) {

  var sal: Float = 0f; // Class Level Variable(Data Memebers")
  var name1: String = "";
  var add1: String = _;

  def this() {
    this("", ""); // Must be require calling to Primary Constror
    
    /*this("","",0)*/
  }
  // Auxilioary Constr With single Argument
  def this(name: String) {
    this(name, ""); // Must be require calling to Primary Constror
  }
  //Aux
  def this(name: String, add: String, sal: Float) {
    this(name, add); // Must be require calling to Primary Constror
    println("From 3 Params");
    this.sal = sal;
    this.name1 = name;
    this.add1 = add;
  }

}