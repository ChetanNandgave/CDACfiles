
class Anmal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Cat extends Anmal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class overriding {
    public static void main(String[] args) {
        Anmal a = new Cat(); // runtime polymorphism
        a.sound();
    }
}

