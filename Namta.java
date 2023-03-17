
package basic_c_to_java_convert;

import java.util.Scanner;

public class Namta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number : ");
int n =input.nextInt();
        System.out.println("Enter the last number ; ");
int m=input.nextInt();

for(int i=n;i<=m;i++){
for(int j=1;j<=10;j++)  
    System.out.printf("%dx%d=%d\n",i,j,i*j);
    System.out.println("\n");
    }

    }
}
