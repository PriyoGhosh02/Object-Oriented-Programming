
package basic_c_to_java_convert;

import java.util.Scanner;

public class Operationof_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[]={12,22,33,44,55,54,56,67};
        int sum=0;
        for(int x:a)
            sum=sum+x;
        System.out.println(sum);
    }
}
