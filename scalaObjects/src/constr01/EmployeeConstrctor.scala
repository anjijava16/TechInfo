package constr01

class EmployeeConstrctor(name: String, id: Int) { // Primay Constrctor

  def message(): Unit = {

    println("Welcome message " + name);

    println("Welcome Message ID" + id);
  }
}