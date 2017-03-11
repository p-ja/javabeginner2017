public class Strings {
    public static void main(String[] args) {
        String newString = new String("Lorem ipsum");

        final String secret = "s3cr3t";

        String userPassword = "letmein";
        if (secret.equals(userPassword)) {
            System.out.println("1. You are in!");
        } else {
            System.out.println("1. Get out of here!");
        }

        userPassword = "s3cr3t";
        if (secret == userPassword) {
            System.out.println("2. You are in!");
        } else {
            System.out.println("2. Get out of here!");
        }

        userPassword = new String("s3cr3t");
        if (secret == userPassword) {
            System.out.println("3. You are in!");
        } else {
            System.out.println("3. Get out of here!");
        }

        userPassword = new String("s3cr3t");
        if (secret.equals(userPassword)) {
            System.out.println("4. You are in!");
        } else {
            System.out.println("4. Get out of here!");
        }
    }
}
