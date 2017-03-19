
@Workshop("sandbox")
public class Sandbox {

    @Workshop(year = 2016)
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

        Sandbox sandbox = new Sandbox();
        sandbox.oldOne();
        sandbox.user1();
        sandbox.user2();
    }

    @Deprecated
    public void oldOne() {

    }

    @SuppressWarnings("deprecation")
    public void user1() {
        oldOne();
    }

    public void user2() {
        oldOne();
    }

    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
