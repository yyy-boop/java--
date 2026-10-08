// 第7集：多态
// 三条件：继承 + 重写 + 父类引用指向子类对象；向下转型配合 instanceof 更安全
public class PolymorphismDemo {
    public static void main(String[] args) {
        // 1. 多态的基本表现：父类引用指向子类对象
        Animal myAnimal = new Dog();
        myAnimal.sound();   // 调用子类重写的方法：Dog barks

        Animal myAnimal2 = new Cat();
        myAnimal2.sound();  // Cat meows

        // 2. 类型转换：向下转型后才能调子类特有方法
        Animal anotherAnimal = new Dog();   // 向上转型
        if (anotherAnimal instanceof Dog) { // 先判断真实类型
            Dog dog = (Dog) anotherAnimal;  // 安全地向下转型
            dog.fetch();
        }

        // 3. 应用场景：数组存放不同子类对象
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.sound();   // 同一方法，不同对象表现不同
        }
    }
}

// 父类
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// 子类 Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // 子类特有方法
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// 子类 Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    // 子类特有方法
    void scratch() {
        System.out.println("Cat scratches the furniture");
    }
}
