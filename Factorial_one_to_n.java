
package basic_c_to_java_convert;

import java.util.Scanner;

public class Factorial_one_to_n {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The value; ");
        int n=input.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--)
   fact=fact*i;    
        System.out.println("Factorial: "+fact);
            }
}
