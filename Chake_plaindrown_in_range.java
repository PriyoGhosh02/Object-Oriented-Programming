
package basic_c_to_java_convert;

import java.util.Scanner;

public class Chake_plaindrown_in_range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int a=input.nextInt();
           System.out.println("Enter the Ending number: ");
        int b=input.nextInt();
        int count=0;
        System.out.println("The plaidrown numbers are: ");
        for(int i=a;i<=b;i++){
                    int sum=0;
            int temp=i;
        while(temp!=0){
        int rem=temp%10;
        sum=(sum*10)+rem;
        temp=temp/10;
        
        }
        if(sum==i){
                System.out.print(" " +i);
                count++;
        }}
        System.out.println("\nThe plaindrowns in this rane: "+count);
       
    }
 
}
