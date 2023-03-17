
package basic_c_to_java_convert;

import java.util.Scanner;

public class m_n_find_odd_sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The start value: ");
        int a=input.nextInt();
                System.out.println("Enter The Ending value: ");
int b=input.nextInt();
int sum=0;
for(int i=a;i<=b;i++){
    if(i%2!=0)
        sum=sum+i;
}
        System.out.println("The sum of this enterd Range: "+sum);  
    }
}
