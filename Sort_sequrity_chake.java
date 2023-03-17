
package basic_c_to_java_convert;

import java.util.Scanner;


public class Sort_sequrity_chake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      String name ; 
      int pass,n=0;
      for(int i=0;i<3;i++){
          System.out.println("Enter the Name: ");
          name=input.next();
          System.out.println("Enter  the Password; ");
          pass=input.nextInt();
    if(name.equals("priyo")&&( pass==(123456))){
            System.out.println("You are successfully login");
    break;}
    else{
         n++;
        if(n==3){
              System.out.println("\nYour are not eligible..!!!!!!!\n");
              break;}
            System.out.println("sorry!!!!!Try again.");
   
      } 
      
      }
     
      
         }
}
