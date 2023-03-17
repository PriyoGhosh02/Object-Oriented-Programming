
package basic_c_to_java_convert;

import java.util.Scanner;

public class one_to_n_fact {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the last Range: ");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
           sum=sum+(i*i);   
            System.out.printf("%dx%d\n",i,i);
        }
        System.out.println("The sum of this all value; "+sum);
        
    }
}
