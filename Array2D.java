
package basic_c_to_java_convert;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of row for those matrix: ");
        int row=input.nextInt();
        System.out.println("Enter the number of coloum for those matrix: ");
        int col=input.nextInt();
       int matrix1[][]=new int[row][col];
       
       int k=0; 
       System.out.println("Enter the First Matrix Element: ");
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.printf("First[%d][%d]=",i,j);
              // matrix1[i][j]=input.nextInt();
                matrix1[i][j]=k;
                k++;
           }
        }
        
        int matrix2[][]=new int[row][col];
        int p=7;
           System.out.println("Enter the second Matrix Element: ");
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.printf("Second[%d][%d]=",i,j);
               //matrix2[i][j]=input.nextInt();
                matrix2[i][j]=p;
                p++;
           }
        }
        
        System.out.println("First matrix is: ");
         for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
                System.out.print(" "+matrix1[i][j]);}
             System.out.println();
        }
         
         System.out.println("\n");
        System.out.println("Second matrix is: ");
         for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
                System.out.print(" "+matrix2[i][j]);}
             System.out.println();
        }    
         
          System.out.println("\n");
        System.out.println("First + Second matrix is: ");
         for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
                System.out.print(" "+(matrix1[i][j]+matrix2[i][j]));
           }
             System.out.println();
        }    
         
                   System.out.println("\n");
         System.out.println("sum of diagonal element of First matrix: ");
         int sum=0;
          for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
if(i==j){
    sum=sum+matrix1[i][j];
}
           }
        }
          System.out.println("Sum of diagonal elements: "+sum);
         
           System.out.println("\n");
         System.out.println("sum of Uper triangle element of First matrix: ");
         int sumup=0;
          for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
if(i<j){
    sumup=sumup+matrix1[i][j];
}
           }
        }
          System.out.println("Sum of diagonal elements: "+sumup);
          
           System.out.println("\n");
         System.out.println("sum of Lower triangle element of First matrix: ");
         int sumdown=0;
          for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
if(i>j){
    sumdown=sumdown+matrix1[i][j];
}
           }
        }
          System.out.println("Sum of diagonal elements: "+sumdown);
          
    }
}
