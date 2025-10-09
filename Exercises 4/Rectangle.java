public class Rectangle {
    private int y;
    private int X;


    public Rectangle(int X , int y){
       this.X = X;
       this.y = y;
    }

    public int getArea(){
       return y * X;
    }

    public int getPerimiter(){
        return 2* (y +  X);
    }

}
