package excercis6;

public class Flygplan extends Luftfarkost {
    public Flygplan(int weight, int price){
        super(weight, price);

    }
      @Override
    public String toString(){
      return "Detta är infon om flygplanet, den väger " + weight + " och den kostar: " + price + " och körts ";  
    }
    
} 
