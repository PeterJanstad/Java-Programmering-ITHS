package excercis6;

public class Helikopter extends Luftfarkost {
    
    public Helikopter(int weight, int price){
        super(weight, price);

    }
      @Override
    public String toString(){
      return "Detta är infon om helikoptern , den väger " + weight + " och den kostar: " + price + " och körts ";  
    }
}
