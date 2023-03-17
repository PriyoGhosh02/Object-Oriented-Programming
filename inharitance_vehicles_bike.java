package inharitance;

public class vehicles_bike extends vehicles {
    int wheel,gear;
   String brand;
   vehicles_bike(String c,int w,String brand,int wh,int g){
       super(c,w);
       this.brand=brand;
       wheel=wh;
       gear=g;
       
   }
    @Override
   void print(){
       System.out.println("Bike information: ");
       super.print();
       System.out.println("Number of Wheel: "+wheel);
       System.out.println("Number of Gear:"+gear);
       System.out.println("Brands: "+brand);
       
   }
}
