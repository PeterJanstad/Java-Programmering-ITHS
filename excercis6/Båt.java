package excercis6;

import java.util.Random;

public class Båt extends Vehicles{
    
    private double latitude;
    private double longitude;

    public Båt (int weight, int price){
        super(weight, price);
        this.latitude = 0;
        this.longitude= 0;

    }
    
    public void go(){
        Random gps = new Random();
        latitude= -90 + (180*gps.nextDouble());
        longitude = -180 + (360 * gps.nextDouble());
        
    }
    @Override
    public String toString(){

        return "Detta är infon om båt: " + weight +"kg, och kostar : "+ price + " ,gps-positionen är " + latitude + " " + longitude; 
    }
    }
