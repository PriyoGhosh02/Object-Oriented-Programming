
package ExceptionHandling;

import java.util.Scanner;

public class problemException {
    public static void main(String[] args) {
        int count=1;
       while(count==1){
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int a=input.nextInt();
        System.out.println("Enter Number2: ");
        int b=input.nextInt();
        int result=a/b;
        System.out.println("Result: "+a+"/"+b+"="+result);
        count++;
        }catch(Exception e){
            System.out.println("Exception: "+e);
            System.out.println("Please Enter the Integer Number!!");
        }
        }
        
        
        
    }
    
}
