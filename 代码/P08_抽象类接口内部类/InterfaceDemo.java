// 第8集：接口
// 接口定义 "can do" 行为规范；常量默认 public static final；Java 8 起有 default 方法和静态方法
public class InterfaceDemo {
    public static void main(String[] args) {
        // 调用接口的静态方法
        Flyable.info();  // This is the Flyable interface.

        // Bird：重写了 fly 和 land
        Flyable bird = new Bird("Sparrow");
        bird.fly();    // Sparrow is flying ... 1000 km/h
        bird.land();   // Sparrow is landing gracefully
        System.out.println(bird.MAX_SPEED + " km/h");  // 1000 km/h

        System.out.println();

        // Airplane：只实现 fly，land 使用默认实现
        Flyable airplane = new Airplane("Boeing 747");
        airplane.fly();  // Boeing 747 is flying ...
        airplane.land(); // Landing...
    }
}

// 定义接口 Flyable
interface Flyable {
    int MAX_SPEED = 1000;  // 默认 public static final

    void fly();            // 抽象方法：实现类必须实现

    default void land() {  // 默认方法（Java 8）
        System.out.println("Landing...");
    }

    static void info() {   // 静态方法（Java 8）
        System.out.println("This is the Flyable interface.");
    }
}

// 实现类 Bird
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

// 实现类 Airplane
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
