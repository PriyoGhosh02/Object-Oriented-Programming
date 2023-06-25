
package ExceptionHandling;

import java.util.Scanner;

public class ThrowsThrows1 {
    void votter(int age)throws Exception {
        if(age<18){
            throw new Exception ("You are not Eligible for Voat!!");
        }
        else{
            System.out.println("You are Eligible for Voted");
        }
    }
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
    int n=input.nextInt();        
    
ThrowsThrows1 ob= new ThrowsThrows1();

try{
    ob.votter(n);
}catch(Exception e){
    System.out.println(e);
}

    }
    
}
