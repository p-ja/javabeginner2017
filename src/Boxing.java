public class Boxing {

    public static void main(String[] args) {

        byte bytePrimitive = 10;
        Byte byteObject = 20;

        System.out.println(bytePrimitive + 2);
        System.out.println(byteObject + 4);

        System.out.println(byteObject.toString());

        // 010 0x10
        Integer intObject = Integer.valueOf(10);
        System.out.println(intObject.hashCode());
        System.out.println(sum(intObject, 5));
    }

    private static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
