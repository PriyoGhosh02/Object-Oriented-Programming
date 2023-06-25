
package ExceptionHandling;

class UserDefineEX extends Exception{
    
    UserDefineEX(String s){
       super(s);
    }
}
class chake{
 public void div(int x, int y) throws UserDefineEX{
        if(y<=0){
              throw new UserDefineEX("User Define Exception");
        }else{
            System.out.println("Result: "+(x/y));
        }
    }
}
public class TestException{
   
    
    public static void main(String[] args) {
        
        try {
          chake c=new chake();
          c.div(12, 2);
        } catch (UserDefineEX ex) {
            System.out.println(ex);
        }
        
        
    }
}
