
package method_string_arraylist;

public class stringBuffer_method {
    public static void main(String[] args) {
        StringBuffer st =new StringBuffer("Priyo");
        System.out.println(st);
        
        //append method is used for adding all type of value with string 
        st.append(" Ghosh ");
        st.append(02);
        System.out.println(st);
        
      // st.setLength(5);
        //System.out.println(st);
        
      // st.reverse();
        //System.out.println(st);
        
        st.delete(6, 11);
        System.out.println(st);
        
        // Chake String is Plaindrown or Not with Method
        String ss= new String("Madam");
        StringBuffer sb=new StringBuffer(ss);
        String s=sb.reverse().toString();
        if(ss.equals(s))
            System.out.println("This String is Plaindrown.");
        else 
            System.out.println("Not plaindrown");
        
        
        
        
        
        
        
    }
 
}
