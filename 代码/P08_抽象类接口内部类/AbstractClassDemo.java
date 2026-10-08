// 第8集：抽象类
// 抽象类不能实例化；抽象方法没有方法体；非抽象子类必须实现抽象方法
public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        dog.sound();  // 旺财 says: Woof!
        dog.sleep();  // 旺财 is sleeping.

        // Animal animal = new Animal("x");  // 编译报错：抽象类不能实例化
    }
}

// 抽象类 Animal
abstract class Animal {
    protected String name;

    // 构造方法
    public Animal(String name) {
        this.name = name;
    }

    // 抽象方法：子类必须实现
    public abstract void sound();

    // 普通方法：所有子类共享
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// 子类 Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof!");
    }
}
