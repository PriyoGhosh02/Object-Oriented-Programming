
package basic_c_to_java_convert;

import java.util.Scanner;

public class Plaindrown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=input.nextInt();
        int temp=a;
        int sum=0;
        while(temp!=0){
        int rem=temp%10;
        sum=(sum*10)+rem;
        temp=temp/10;
        }
        System.out.println("Reverse: "+sum);
        if(a==sum)
            System.out.println("The number is plaindrown.");
        else 
            System.out.println("Not Plaindrown.");
    }
 
}
