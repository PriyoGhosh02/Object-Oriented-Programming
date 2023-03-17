
package basic_c_to_java_convert;

import java.util.Arrays;
import java.util.Scanner;


public class Array_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array element: ");
        for(int i=0;i<n;i++)
            arr[i]=input.nextInt();
        Arrays.sort(arr);
        System.out.print("Assending: ");
                for(int i=0;i<n;i++)
                    System.out.print(" "+arr[i]);
                System.out.println();
        System.out.print("Desending: ");
         for(int i=n-1;i>=0;i--)
                    System.out.print(" "+arr[i]);
        
         String name[]=new String[n];
         System.out.println("\nEnter Name: ");
         for(int i=0;i<=n;i++)
             name[i]=input.nextLine();
         System.out.println();
                Arrays.sort(name);
for(int i=0;i<=n;i++)
    System.out.print(" "+name[i]);
         
    }
}
