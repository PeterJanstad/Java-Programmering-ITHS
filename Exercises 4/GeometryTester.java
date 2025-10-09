public class GeometryTester{
    public static void main(String[] args) {
        
        Circle c = new Circle(1);
        System.out.println("Cirkle area " + c.getArea());
        System.out.println("Circle circumference " + c.getCircumference());
       
    
       
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle area is " + r.getArea());
        System.out.println("The perimter of rectangle is " + r.getPerimiter());

        kvadrat k = new kvadrat(1, 2, "hej");
        System.out.println("omkresten på kvadraten är " + k.getKvadrat());
        System.out.println("jag vill bara säga " + k.getHello() + ", kämpa på Johan!!!" );

    }
}