
package method_string_arraylist;

public class convertion_numnber_system {
    public static void main(String[] args) {
        int i=10;
        //String s=Integer.toBinaryString(i);
       // String s=Integer.toHexString(i);
       String s=Integer.toOctalString(i);
        
        System.out.println(s);
        
        //***************Any number system to decimal***************
       // String binary="1100";
        //String octal="675";
        String hexa="A";
        int x=Integer.parseInt(hexa, 16);
        System.out.println(x);
        
        
    }
}
