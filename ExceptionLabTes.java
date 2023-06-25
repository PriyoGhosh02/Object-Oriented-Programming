
package ExceptionHandling;

 class ExceptionLab extends Exception{
        
 private int a;
 ExceptionLab(int i) { a = i;}
 @Override
 public String toString ()
 { return "MyException[" + a+"]";}
 }

 class Test{
 static void compute (int a) throws ExceptionLab{
 if(a>10)
 throw new ExceptionLab(a);
 System.out.println("Normal Exit");
 }
 }

public class ExceptionLabTes {
public static void main(String[] args) {
 try{
 Test.compute(1);
 Test.compute(20);
 } catch(ExceptionLab e){
 System.out.println("Caught "+e);
 }
 }
}
