public class Polymorphism {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();


        Animal [] animals = new Animal [2];

        animals[0] = dog1;
        animals[1] = cat1;

        for (Animal animal : animals) {
            animal.eat();
        }
    }

}

class Animal {
    public void eat() {
        System.out.println("The animal eats.");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog eats.");
    }

}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats");
    }






}

