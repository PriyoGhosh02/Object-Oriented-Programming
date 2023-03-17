
package method_string_arraylist;

public class string_method {
    public static void main(String[] args) {
        String s1="priyo";
        String s2=new String(" Ghosh ");
        char  []s3={'p','r','i','y','o'};
        System.out.println(s3);
        System.out.println(s1+"\n"+s2);
        
        int lent=s1.length();
        System.out.println("Length of s1: "+lent);
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Two string are equal");
        else 
            System.out.println("Two string are not equal");
        
         boolean dis =s1.contains("priyo");
         System.out.println(dis);
        
        boolean chake= s1.isBlank();
      //  boolean chake= s1.isEmpty()
        System.out.println("String are empty: "+chake);
         
         //Adding two string 
         String fullname=s1.concat(s2);
         System.out.println("Full Name: "+fullname);
        
        String uppercasename=fullname.toUpperCase();
        System.out.println("The Uppper Case name: "+uppercasename);        
        
         String lowercasename=fullname.toLowerCase();
        System.out.println("The Lower Case name: "+lowercasename);        
        
        boolean chk=s1.startsWith("P");
        System.out.println(chk);
        
        boolean ck=s2.endsWith("h");
        System.out.println(ck);
        
    char ch=s1.charAt(0);
        System.out.println("Letter: "+ch);
        int value=s1.codePointAt(0);
        System.out.println("Value of: "+value);
        
        int pos=fullname.indexOf("o");
        System.out.println(pos);
        pos=fullname.lastIndexOf("o");
        System.out.println(pos);
        
   //trim() using for removing spach after and before of a string 
        System.out.println(s2);
        String remove_spach=s2.trim();
        System.out.println(remove_spach);
        
        String ss=s1.replace('o', 'a');
        System.out.println(ss+"\n");
        
        // split() is used for divided on given Expression 
        String  []s =fullname.split(" ");
        for(String x:s)
                    System.out.println(x);

            
    }
 
}
