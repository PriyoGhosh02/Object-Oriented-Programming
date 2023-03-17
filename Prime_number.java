
package basic_c_to_java_convert;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("Enter the starting number: ");
               int  a=input.nextInt();
        System.out.println("Enter the last number: ");
    int b=input.nextInt();
    int i,j,prime=0;
    
    for(i=a;i<=b;i++){
        int count=0;
          for(j=2;j<=i/2;j++){
              if(i%j==0){
                 count++;
              break;
              } 
              
          } 
          if(count==0&&i!=0&&i!=1){
            System.out.print(" "+i);  
          prime++;}
    }
        System.out.println("\nTotal prime number: "+prime);
    
    
    }
}
