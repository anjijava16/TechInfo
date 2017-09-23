

object ProcessMainObject {

  def main(args: Array[String]): Unit = {

    // New Object creation KeyWord

    var ref = new MyClassStudent();

    // Calling the Methods
    var name: String = "Shekar";
    var id: Int = 20;
    ref.studentInfo(name, id);

  }
}