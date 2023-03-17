
package basic_c_to_java_convert;

import java.util.Scanner;


public class Bouble_Int_string {
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        int []arr=new int[10];
        int i,n ;
        System.out.print("Enter array limit: ");
        n=input.nextInt();
        for(i=0;i< n;i++)
            arr[i]=input.nextInt();
        bouble_sort(arr,n);
 
        System.out.print("\nEnter the line: ");
        String ch=input.next();
        String Ch=ch.toLowerCase();
     int N=Ch.length();
             char a[] = Ch.toCharArray();
             string_swap(a,N);
        
    }
    
   static void bouble_sort(int arr[],int n){
        int i,j,temp;
        for(i=0;i<n-1;i++){
            int flag=0;
            for(j=0;j<n-1-i;j++){
               if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   flag=1;
               } 
            }
            if(flag==0)
    break;
        }
        System.out.println("After sorting: ");
        for(i=0;i<n;i++)
                    System.out.print("\t"+arr[i]);
}
    
   static void string_swap(char a[],int N){
       char tem;
       int i,j;
     for(i=0;i<N-1;i++){
         int f=0;
         for(j=0;j<N-1-i;j++){
            if(a[j]>a[j+1]){
                tem=a[j];
                a[j]=a[j+1];
                a[j+1]=tem;
                f=1;
             }
         }
         if(f==0)
             break;
     }
      System.out.println("After sorting: ");
        for(i=0;i<N;i++)
                    System.out.print(""+a[i]);
   }
}
