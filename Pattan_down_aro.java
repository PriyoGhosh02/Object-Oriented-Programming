
package basic_c_to_java_convert;

import java.util.Scanner;

public class Pattan_down_aro {
     public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int n=input.nextInt();
        for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++)
  System.out.print("*");
            System.out.println();
        }
        }
}
