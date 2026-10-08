// 第7集：继承
// super 调父类属性/方法/构造；方法重写 @Override；final 方法不能重写、final 类不能继承
public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printNames();

        Parent parentRef = new Child();   // 父类引用指向子类对象
        parentRef.greet();

        System.out.println("Parent's a = " + parentRef.a);

        child.finalMethod();

        // class SubFinalClass extends FinalClass {}  // 编译报错，FinalClass 不能被继承
    }
}

// 父类
class Parent {
    int a;                 // 父类属性
    String name = "Parent";

    // 父类构造方法
    public Parent(int a) {
        this.a = a;
        System.out.println("Parent constructor called with a = " + a);
    }

    void greet() {
        System.out.println("Hello from Parent");
    }

    // final 方法：子类不能重写
    final void finalMethod() {
        System.out.println("This is a final method in Parent");
    }
}

// 子类
class Child extends Parent {
    public Child() {
        super(20);   // 调用父类构造方法，把 a 设为 20
        System.out.println("Child constructor called");
    }

    // 重写父类的 greet 方法
    @Override
    void greet() {
        super.greet();   // 调用父类的 greet 方法
        System.out.println("Hello from Child");
    }

    void printNames() {
        System.out.println("Parent name: " + super.name);  // 调用父类的 name
        System.out.println("Child name: " + this.name);    // 当前类的 name
    }
}

// final 类不能被继承
final class FinalClass {
    void display() {
        System.out.println("This is a final class and cannot be extended");
    }
}
