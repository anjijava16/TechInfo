

class MyClassStudent {
  
  var id: Int = 0; // All fields must be initialized  
  var name: String = null;
  var sal: Float = 0.0f;

  def studentInfo(name: String, id: Int): Unit = {

    println("Student Name =" + name);
    println("Student Id=" + id);
    
  }
  
  
}