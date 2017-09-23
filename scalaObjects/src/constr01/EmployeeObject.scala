package constr01

object EmployeeObject {

  def main(args: Array[String]): Unit = {

    var ref = new EmployeeConstrctor("abc", 20);
    ref.message();

    
   var ref1 = new EmployeeConstrctor("NEW", 30);
    ref1.message();

    // Here We are from Object ===================>>> Class
    
  }
}