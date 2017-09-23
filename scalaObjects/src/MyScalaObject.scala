

class Student {
  var id: Int = 0; // All fields must be initialized  
  var name: String = null;
}

object MyScalaObject {

  var id: Int = 0; // All fields must be initialized  
  var name: String = null;

  def main1(args: Array[String]): Unit = {
    var s = new Student() // Creating an object  
    println(s.id + " " + s.name);
  }

  def functionExample() = { // Defining a function  
    var a = 10
    a
  }
  def main2(args: Array[String]): Unit = {

    println(functionExample());
  }
  
  def main(args: Array[String]) = {  
        var result1 = functionExample(15,2)     // Calling with two values  
        var result2 = functionExample(15)   // Calling with one value  
        var result3 = functionExample()     // Calling without any value
        println(result1+"\n"+result2+"\n"+result3)  
    }  
    def functionExample(a:Int = 0, b:Int = 0):Int = {   // Parameters with default values as 0  
        a+b  
    }  
}  