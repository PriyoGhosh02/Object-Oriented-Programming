
package ExceptionHandling;

import java.util.Scanner;

 class customEx extends Exception{
    
    customEx(String st){
        super(st);
    }
   }

class customExVaid {
    public void chake(int age) throws customEx {
           if(age<18){
               throw new customEx("Your age is Under 18.. Try after  "+(18-age)+"   Years");
           }else{
               System.out.println("Welcome");
           }
}}


public class customExTes {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter Your age: ");
          int age=input.nextInt();
        customExVaid v=new customExVaid();
        try {
            v.chake(age);
          //  v.chake(20);
        } catch (customEx ex) {
            System.out.println(ex.getMessage());
        }
    }
}
