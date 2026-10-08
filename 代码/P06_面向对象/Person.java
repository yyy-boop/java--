// 第6集：Person 类的构造方法
// 构造方法与类同名、没有返回值，用 this 给成员变量赋值
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {  // 构造方法
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("张三", 20);
        System.out.println("name = " + person.name);
        System.out.println("age = " + person.age);
    }
}
