package SummarySession._2023_02_09;

public class InheritanceExamples {
    public static void main(String[] args) {

        Animal animal  = new Animal();
        animal.voice();

        Dog dog = new Dog();
        dog.voice();

        Shepherd shepherd = new Shepherd();
        shepherd.voice();

        Bird bird = new Bird();
        bird.voice();

        Parrot parrot = new Parrot();
        parrot.voice();
    }
}

class Animal {
    public void voice() {
        System.out.println("Voice-voice");
    }

    public void animalMethod() {}
}

class Bird extends Animal implements Flynig {
    @Override
    public void voice() {
        System.out.println("Trululu");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

class Parrot extends Bird {
    @Override
    public void voice() {
        System.out.println("Chick-chi-rick");
    }
}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Bark-Bark");
    }

    public void dogMethod() {}
}

class Shepherd extends Dog {
    @Override
    public void voice() {
        System.out.println("Bark-_2023_02_09.Shepherd-Bark");
    }

}

// -> направление в сторну дочернего класса

// _2023_02_09.Shepherd <- _2023_02_09.Dog <- _2023_02_09.Animal <- многоуровневое наследование
// _2023_02_09.Bird <- _2023_02_09.Animal -> _2023_02_09.Dog     <- иерархического сценария

interface Flynig {
    void fly();
}