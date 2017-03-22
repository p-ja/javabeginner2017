/**
 *
 */
@Workshop("javadev")
public class Annotations {

    @Workshop(year = 2016)
    public static void main(String[] args) {

        Annotations annot = new Annotations();
        annot.oldOne();
        annot.user1();
        annot.user2();

        Workshop workshop = annot.getClass().getAnnotation(Workshop.class);
        System.out.println(workshop.value());
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
