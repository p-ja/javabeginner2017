public class Strings {
    public static void main(String[] args) {

        // Creating String
        String newString = new String("Lorem ipsum");

        char[] loremArr = {'l', 'o', 'r', 'e', 'm', '.'};
        String loremStr = new String(loremArr);
        System.out.println(loremStr);

        // String concatenation
        String firstName = null;
        String lastName = "Doe";
        System.out.println("First Name plus Last Name = " + firstName + " " + lastName);

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Fullname = ".concat(fullName));

        StringBuilder sb = new StringBuilder();
        sb.append("String Builder = ");
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        System.out.println(sb.toString());

        // String length
        String lorem = "Lorem ipsum";
        int length = lorem.length();
        System.out.println(length);

        // Comparing Strings
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
