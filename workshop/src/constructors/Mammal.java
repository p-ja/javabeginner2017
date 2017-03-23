package constructors;

/**
 *
 */
class Mammal extends Animal {

    Mammal() {
        System.out.println("I'm a mammal");
    }

    Mammal(String translation) {
        System.out.println(translation);
    }
}
