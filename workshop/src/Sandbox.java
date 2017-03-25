import oop.inheritance.Rectangle;
import oop.inheritance.Square;

public class Sandbox {

    public static void main(String[] args) {

        String text = "Lorem ipsum";
        final String textF = "Final countdown";


        text = "dolor sit amet";



        float a = 1.0f;
        float b = 2.0f;

        float c = a + b;
        c++;

        System.out.println(c);

        byte bitB = ((byte) 6) & 2;
        System.out.println(bitB);

        bitB <<= 2;
        System.out.println(bitB);

        // OOP Inheritance
        Rectangle rect = new Rectangle(2, 3);
        System.out.println(rect.area());

        Square square = new Square(3);
        System.out.println(square.area());


        float f = (1 / 4) * 10;
        int i = Math.round(f);
        System.out.println(i);
    }

}
