package excercis6;

public class Vehicles {
    protected int weight;
    protected int price;
  
public Vehicles( int weight, int price){

    this.weight= weight;
    this.price= price;

}
public static void main(String[] args) {
    Landfordon lf = new Landfordon(3500, 60000);
    Båt boat = new Båt(500, 6000);
    boat.go();
    System.out.println(boat);
    System.out.println("\n");

    Bil car = new Bil(26000, 70000);
    System.out.println(car);
    lf.kör(20);
    System.out.println("\n ");

    Flygplan airplane = new Flygplan(8000000, 2000000000);
    System.out.println(airplane);
    airplane.fly(true);
    airplane.fly(false);
    airplane.fly(true);
    
    System.out.println("\n");

    
    Helikopter heli = new Helikopter(8900000, 7800000);
    System.out.println(heli);
    airplane.fly(true);
    airplane.fly(false);
    System.out.println("\n ");

    Motorcykel mc = new Motorcykel(360, 600000);
    System.out.println(mc);
    lf.kör(67);
}
public String toString(){
    return "vikt: " + weight + " kg. Pris " + price + " kr"; 
}
    
}











