public class Operators {
    public static void main(String[] args) {

        // + number (byte, short, int, long)
        byte a = 29;
        byte b = 5;

        System.out.println(a + b);

        // + String
        String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName + " " + lastName);

        // ? : operator
        boolean isDark = true;
        String side = isDark ? "dark side" : "light side";

        // initialized to null
        String forceSide;
        if (isDark) {
            forceSide = "dark side";
        } else {
            forceSide = "light side";
        }

        // else if (isJedi)
        System.out.println(String.format("Anakin joined %s of the force", side));


        // INSTANCEOF
        doSomething(Integer.valueOf(1));
        doSomething(Double.valueOf(2));
        doSomething(Float.valueOf(3));
    }

    public static void doSomething(Number param) {
        if (param instanceof Double) {
            System.out.println("param is a Double");
        } else if (param instanceof Integer) {
            System.out.println("param is an Integer");
        }

        if (param instanceof Comparable) {
            System.out.println("param is comparable");
        }
    }
}
