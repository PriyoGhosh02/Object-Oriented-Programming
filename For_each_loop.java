
package basic_c_to_java_convert;

public class For_each_loop {
    public static void main(String[] args) {
        String name[]={"priyo","cse","java","OOP"};
       System.out.println("Length: "+name.length);
        for(String i : name)
                System.out.print(" "+i);
        int arr[]={12,34,12,43,45,34};
        System.out.println("\nNumbers:  "+arr.length);
        int sum=0;
        for(int x : arr){
            System.out.print(" "+x);
            sum=sum+x;
        }
        System.out.println("Sum: "+sum);
    }
}
