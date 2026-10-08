// 第8集：抽象类、接口、四种内部类
public class AbstractInterfaceInner {

    // 四种内部类
    class MemberInnerClass {
        void display() { System.out.println("This is a member inner class"); }
    }

    static class StaticNestedClass {
        void display() { System.out.println("This is a static nested class"); }
    }

    void createLocalAndAnonymousClasses() {
        class LocalInnerClass {
            void display() { System.out.println("This is a local inner class"); }
        }
        new LocalInnerClass().display();

        Runnable anonymousInner = new Runnable() {
            @Override
            public void run() { System.out.println("This is an anonymous inner class"); }
        };
        anonymousInner.run();
    }

    public static void main(String[] args) {
        // 抽象类
        Dog dog = new Dog("旺财");
        dog.sound();
        dog.sleep();

        // 接口
        Flyable.info();
        Flyable bird = new Bird("Sparrow");
        bird.fly();
        bird.land();
        Flyable airplane = new Airplane("Boeing 747");
        airplane.fly();
        airplane.land(); // 默认实现

        // 内部类
        AbstractInterfaceInner outer = new AbstractInterfaceInner();
        outer.new MemberInnerClass().display();
        new StaticNestedClass().display();
        outer.createLocalAndAnonymousClasses();
    }
}

// ==== 抽象类 ====
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound(); // 抽象方法无方法体

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof!");
    }
}

// ==== 接口 ====
interface Flyable {
    int MAX_SPEED = 1000; // 默认 public static final

    void fly();

    default void land() {
        System.out.println("Landing...");
    }

    static void info() {
        System.out.println("This is the Flyable interface.");
    }
}

class Bird implements Flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the sky with a max speed of " + Flyable.MAX_SPEED + " km/h");
    }

    @Override
    public void land() {
        System.out.println(name + " is landing gracefully");
    }
}

class Airplane implements Flyable {
    private String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println(model + " is flying at high altitude with a max speed of " + Flyable.MAX_SPEED + " km/h");
    }
}
