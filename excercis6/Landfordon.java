package excercis6;

public class Landfordon extends Vehicles {
    protected int kmRäknare = 0;

    public Landfordon( int weigth, int price){
        super(weigth, price);

    }
    
    public void kör(int kms){
        if (kms > 0 ){
            kmRäknare += kms ;
            System.out.println(kmRäknare + " km");
        }


    }
}
