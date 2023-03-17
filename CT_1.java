
package basic_c_to_java_convert;

import java.util.Scanner;

public class CT_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int arr []=new int [5];
        int i,sum=0,avg=0;
        for(i=0;i<5;i++)
            arr[i]=input.nextInt();
        
        //sum
        for(i=0;i<5;i++)
            sum=sum+arr[i];
        System.out.println(sum);
        avg=sum/5;
        System.out.println(avg);
        for(i=0;i<5;i++){
            if(arr[i]==avg+3 || arr[i]==avg-3 ){
                System.out.println(i);
            }
        }
            
        
        
    }
}
