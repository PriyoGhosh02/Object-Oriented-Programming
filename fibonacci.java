package basic_c_to_java_convert;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want: ");
    int n=input.nextInt();
    int first=0,second=1,fibo ,i;
        System.out.print(first+" "+second);
    for(i=3;i<=n;i++){
    fibo=first+second;
        System.out.print(" "+fibo);
        first=second;
        second=fibo;
    }
    
       /* System.out.println("Enter What number you want: ");
    int a=input.nextInt();
    if(a==0||a==1)
            System.out.println(a);
    else
    fibo=first+second;
    
    for(i=3;i<=n;i++){
        first=second;
        second=fibo;
        fibo=first+second;
    }
                        System.out.print(" "+second);*/

    }
  
}
