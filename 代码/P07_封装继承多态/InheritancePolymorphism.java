public class InheritancePolymorphism {
    public static void main(String[] args) {
        // 继承
        Child child = new Child();
        child.printNames();

        Parent parentRef = new Child(); // 父类引用指向子类对象
        parentRef.greet();
        System.out.println("Parent's a = " + parentRef.a);
        child.finalMethod();

        // 多态
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Dog barks
        new Cat().sound(); // Cat meows

        Animal another = new Dog();
        if (another instanceof Dog) {
            ((Dog) another).fetch(); // 向下转型后调子类特有方法
        }

        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}

// ==== 继承 ====
class Parent {
    int a;
    String name = "Parent";

    public Parent(int a) {
        this.a = a;
        System.out.println("Parent constructor called with a = " + a);
    }

    void greet() {
        System.out.println("Hello from Parent");
    }

    final void finalMethod() { // final 方法不能被重写
        System.out.println("This is a final method in Parent");
    }
}

class Child extends Parent {
    public Child() {
        super(20);
        System.out.println("Child constructor called");
    }

    @Override
    void greet() {
        super.greet();
        System.out.println("Hello from Child");
    }

    void printNames() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + this.name);
    }
}

final class FinalClass { // final 类不能被继承
    void display() {
        System.out.println("This is a final class and cannot be extended");
    }
}

// ==== 多态 ====
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    void scratch() {
        System.out.println("Cat scratches the furniture");
    }
}
