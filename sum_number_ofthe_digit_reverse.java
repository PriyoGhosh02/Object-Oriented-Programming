
package basic_c_to_java_convert;

import java.util.Scanner;

public class sum_number_ofthe_digit_reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ehter the number: ");
        int num=input.nextInt();
        int temp=num;
  sumOFdigits(temp);
  reverse_number(temp);
    }

  public static void sumOFdigits(int temp){
      int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        System.out.println("The sumof this Number: "+sum);
        }
  public static void reverse_number(int temp){
   int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;
        }
        System.out.println("The Reverse number: "+sum);
  }

}

