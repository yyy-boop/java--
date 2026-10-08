// 第7集：父类构造方法的调用顺序
// new 子类时先执行父类构造；父类构造中经多态调到子类方法，但此时子类字段还是默认值 0
public class ConstructorOrderDemo {
    public static void main(String[] args) {
        new Dog(2);
    }
}

class Dog extends Animal {
    private int age;

    public Dog(int age) {
        this.age = age;
        System.out.println("I am a dog, my age is " + this.age);
    }

    @Override
    public void sound() {   // 子类重写方法
        System.out.println("I am a dog, my age is " + this.age);
    }
}

class Animal {
    Animal() {
        System.out.println("before sound");
        sound();            // 多态：实际调 Dog 的 sound，但 age 还没赋值
        System.out.println("after sound");
    }

    public void sound() {
        System.out.println("I am an animal");
    }
}
