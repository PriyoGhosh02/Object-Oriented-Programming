

package basic_c_to_java_convert;

import java.util.Scanner;


public class Pattan_1_0_print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
    if(j%2!=0)
            System.out.print("1");
    else
            System.out.print("0");
    }    
            System.out.println();    }
    
    
    }
}
