
package inharitance;

public class Test {
    public static void main(String[] args) {
        personal_info ob=new personal_info();
        ob.id=177;
        ob.age=21;
        ob.name="Priyo";
        ob.setQualifiction("Student");
        ob.print();
        
                personal_info ob1=new personal_info();
ob1.set(178, 22, "Rifat");
        ob1.setQualifiction("Student");
        ob1.print();
        //for chaking inheritance, those class are inhertaed? 
        System.out.println(ob1 instanceof common_info);
    }
}
