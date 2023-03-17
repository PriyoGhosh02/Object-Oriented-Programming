package basic_c_to_java_convert;

import java.util.Scanner;

public class Binary_linear_search {
    public static void main(String[] args) {
        
    
     Scanner input = new Scanner(System.in);
             int i,n,val,mid,l=0;
       int []arr=new int[10];
       System.out.print("Enter limit: ");
       n=input.nextInt();
        System.out.println("Enter array element: ");
       for(i=0;i<n;i++)
 arr[i]=input.nextInt();      
              System.out.print("The array is: ");
               for(i=0;i<n;i++)
       System.out.print("\t"+arr[i]);
System.out.print("\nENter searching value: ");
val= input.nextInt();

int h=n-1;
while(l<=h){
    mid=(l+h)/2;
    if(arr[mid]==val){
        System.out.printf("\nItem found position %d",mid+1); 
    break;
    }
   
    else if(val<arr[mid])
        h=mid-1;
    else
        l=mid+1;
           
}
if(l>h)
    System.out.println("Item not found");


/*for(i=0;i<n;i++){
    if(arr[i]==val){
System.out.println("Founded");
break;}
    else{
    System.out.println("Not Found");
break;
    }}
*/
}}



