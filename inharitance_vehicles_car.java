
package inharitance;

public class vehicles_car extends vehicles {
    int wheel,gear;
   String brand;
   vehicles_car(String c,int w,String brand,int wh,int g,String glassColour){
       super(c,w,glassColour);
       this.brand=brand;
       wheel=wh;
       gear=g;
   }
       void display(){
            System.out.println("Car information: ");
       super.print();   
       }
/*
       there is no need to use this key word  because compilear auto meticlay 
       denote this class in a same class, if you use this keyword thats ok no problem
       here.
       */
    @Override
   void print(){      
   display();
       System.out.println("Number of Wheel: "+wheel);
       System.out.println("Number of Gear:"+gear);
       System.out.println("Brands: "+brand);
       
       
   }
}
