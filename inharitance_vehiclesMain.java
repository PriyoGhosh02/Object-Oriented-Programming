
package inharitance;

public class vehiclesMain {
    public static void main(String[] args) {
        // input vehicles (colour,weight, brand name,number of wheel,number of gear)
        vehicles_car car1=new vehicles_car("RED",1000,"TOYTA",
                                                                      4,5,"Black");
        car1.print();
               System.out.println("\n\n");

        vehicles_bike bike1=new vehicles_bike("RED", 250,"HONDA",
                                                                            2,4);
        bike1.print();
        
    }
}
