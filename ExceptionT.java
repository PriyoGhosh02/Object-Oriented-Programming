
package ExceptionHandling;

public class ExceptionT {
    public static void main(String[] args) {
        /*
        when find a Excption in the code then you use try block
        from this try block this excption throw catch recive it.
        */
        try {
            int x=10;
            int y=0;
       int result=x/y;
            System.out.println("Result: "+result);
            /*
            catch (Exception  variable(that's stroeed the exception))  excption means 
            all types of exction in the excption package and variable stored this
            excption.
            */
        } catch( Exception e){ 
            System.out.println("Exception: "+e);
        }
        /*
        this block use when you are not handel the  exception but you need to 
        run the another part of programs then you use to finally block
        */
        finally{
                    System.out.println("Last line.");

        }
    }
}
