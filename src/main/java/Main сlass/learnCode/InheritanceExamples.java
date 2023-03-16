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
        bird.fly();
        bird.eat();

        Parrot parrot = new Parrot();
//        parrot.voice();
//        parrot.fly();
//        parrot.eat();
    }
}

class Animal {
    public void voice() {
        System.out.println("Voice-voice");
    }

    public void animalMethod() {}

    private void getAge() {}
}

class Bird extends Animal implements Flying, Eating {
    @Override
    public void voice() {
        System.out.println("Trululu");
    }

    @Override
    public void fly() {
        System.out.println("fly skill was added");
    }

    @Override
    public void eat() {
        System.out.println("eat skill was added");
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
        System.out.println("Bark-Shepherd-Bark");
    }

}

// -> направление в сторону дочернего класса

// Shepherd <- Dog <- Animal <- многоуровневое наследование
// Bird <- Animal -> Dog     <- иерархического сценария

interface Flying {
    void fly();
}

interface Eating {
    void eat();
}

