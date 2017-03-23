package constructors;

/**
 *
 */
class Dog extends Mammal {

    private boolean isPet = true;

    Dog() {
        super("Jestem ssakiem");
        System.out.println("I'm a dog");
    }

    Dog(boolean isPet) {
        this.isPet = isPet;
    }
}
