package excercis6;

public class Motorcykel extends Vehicles{
        public Motorcykel(int weight, int price){
            super(weight, price);
        }
         @Override
    public String toString(){
      return "Detta är infon om motorcykel, den väger " + weight + " och den kostar: " + price + " och körts ";  
    }
}
