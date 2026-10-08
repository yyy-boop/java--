public class OOPDemo {
    public static void main(String[] args) {
        // MyCar：属性的访问修饰符（private 字段只能在 MyCar 内部通过构造/方法访问）
        MyCar car = new MyCar("Model 3", "2024", "SUV", "30万");
        car.show();

        // Person：构造方法与类同名、无返回值，用 this 赋值
        Person person = new Person("张三", 20);
        System.out.println(person);
    }
}

class MyCar {
    private String model;   // 本类
    protected String year;  // 同包 + 不同包子类
    String type;            // 同包
    public String price;    // 所有类

    public MyCar(String model, String year, String type, String price) {
        this.model = model; // private 字段在本类构造中赋值
        this.year = year;
        this.type = type;
        this.price = price;
    }

    public void show() {
        System.out.println(model + " " + year + " " + type + " " + price);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age;
    }
}
