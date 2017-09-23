

object TestObject {

  
  def largest(as: Int*): Int = as.reduceLeft((a, b)=> a max b)
  
  
  def smallest(as:Int*):Int={
    
    
    return 1;
  }
  /*
  def largest(as: Int*): Int = {

    println("INFO "+as);
    println("=======================");*
    return 10;
  }
*/
  def main(arg: Array[String]): Unit = {

   println( largest(10,20,30));
    /*largest(10,20);
    largest(10,30,40);
    */
  }
}