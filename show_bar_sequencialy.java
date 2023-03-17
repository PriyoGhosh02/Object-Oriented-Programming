
package basic_c_to_java_convert;

import java.util.Scanner;

public class show_bar_sequencialy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String days[]={"MONDAY","TUESDAY","WEDNESDAY","ThursDAY","Friday","saturday","sunday"};
        System.out.println("Enter day number: ");
        int n=input.nextInt();
        for(int i=0;i<days.length;i++){
        if(n==i+1)
                System.out.println(days[i]);
        }
            
       
    }
   
}
