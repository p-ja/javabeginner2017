package oop.inheritance;

/**
 *
 */
public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public long area() {
        return a * b;
    }
}
