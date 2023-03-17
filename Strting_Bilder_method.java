
package method_string_arraylist;

public class Strting_Bilder_method {
    public static void main(String[] args) {
       //StringBuilder is same as StringBuffer 
        StringBuilder st=new StringBuilder("Priyo");
        st.append(" Ghosh");
        System.out.println(st);
        
      // st.reverse();
        //System.out.println(st);
        
        st.delete(5, 11);
        System.out.println(st);
        
    }
}
