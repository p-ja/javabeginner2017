import oop.inheritance.Rectangle;
import oop.inheritance.Square;

public class Sandbox {

    public static void main(String[] args) {
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

    }

}
