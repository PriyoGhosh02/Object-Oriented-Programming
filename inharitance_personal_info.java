
package inharitance;

public class personal_info extends common_info {
    int id,age;
    String name;
    private String qualifiction;
    void set(int id,int age,String n){
        this.id=id;
        this.age=age;
        name=n;
    }

    public String getQualifiction() {
        return qualifiction;
    }

    public void setQualifiction(String qualifiction) {
        this.qualifiction = qualifiction;
    }
    
    // method overreading
    @Override
    void print(){
        System.out.println("\n");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Age: "+age);
        System.out.println("Qualifiction: "+qualifiction);
        System.out.println("University: "+versity);
    }
    
}
