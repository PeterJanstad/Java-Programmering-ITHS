package excercis6;

public class Luftfarkost extends Vehicles {
    private int höjd;
    private boolean flyger;

    public Luftfarkost(int weight, int price){
        super(weight, price);
        this.höjd = 0;
        this.flyger= false;
    }
    public void fly(boolean isFlying){
        if (isFlying){
            höjd += 1000;
            flyger = true;;
            System.out.println("Lyfter och har en höjd på " + höjd + " meter");
        }
            else{
                höjd = 0;
                flyger = false;
                System.out.println("Flygplanet kommmer nu landa");

            }
    }
    @Override
        public String toString(){
            return super.toString();

        }
    
}
