public class kvadrat {
    private int kvadrat1;
    private int kvadrat2;
    private String hello;

    public kvadrat(int kvadrat1, int kvadrat2, String helloString){
        this.kvadrat1= kvadrat1;
        this.kvadrat2= kvadrat2;
        this.hello= helloString;
    }

    public int getKvadrat(){
        return kvadrat1 + kvadrat2;

    }
    public String getHello(){
        return hello;
    }
    
}
