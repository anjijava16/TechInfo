package ex2

class Student(id: Int, name: String) { // Primary constructor  
  def show() {
    println(id + " " + name)
  }
}
object MainObject {
  def main(args: Array[String]) {
    var s = new Student(100, "Martin") // Passing values to constructor  
    s.show() // Calling a function by using an object  

    var s1 = new Student(101, "Sartin") // Passing values to constructor  
    s1.show() // Calling a function by using an object  

    new Student(102, "kaka").show();
  }
}  