package excercis6;


public class Bil extends Vehicles{
    public Bil (int weight, int price){
        super(weight, price);
      
    }
    @Override
    public String toString(){
      return "Detta är infon om bil, den väger " + weight + " och den kostar: " + price + " och körts ";  
    }
}

