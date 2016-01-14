
import java.io._

class A( b: Int,  c: Int) {
  
   var x: Int = b
   var y: Int = c
   
  println("Wlecome to SCALA Basic program");
   
   def move(e: Int, f: Int) {
     
      x = x + e
      y = y + f
   
          
      println (" x location : " + x);
      println ("y location : " + y);
   }
}

object Scala_test {
  
   def main(args: Array[String]) {
     
      val a = new A(1,2);
           
      a.move(5, 15);
      a.move(20,30);
   }
}