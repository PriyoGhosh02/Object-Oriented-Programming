package basic_c_to_java_convert;

import java.util.Scanner;


public class Amresstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        int sum=0;
        int temp=num;
        while(temp!=0){
        int rem=temp%10;
        sum=sum+(rem*rem*rem);
        temp=temp/10;
        
        }
        if(num==sum)
            System.out.println("The Given number is Armstrong.");
        else
            System.out.println("The number is not Armestrong.");
        
        
        
    }
  
}
