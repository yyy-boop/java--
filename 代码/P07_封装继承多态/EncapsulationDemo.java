// 第7集：封装（getter/setter + 校验）、隐藏实现细节（性别 0/1）、父类构造调用顺序
public class EncapsulationDemo {

    // 封装：字段私有，受控访问
    static class Person {
        private String name;
        private int age;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }

        public void setAge(int age) {
            if (age >= 0 && age < 300) {
                this.age = age;
            } else {
                System.out.println("年龄必须为正数且小于300");
            }
        }
    }

    // 隐藏实现细节：数据库存 0/1，对外展示 女/男
    static class GenderPerson {
        private int sex;

        public void setGender(String gender) {
            this.sex = "男".equals(gender) ? 1 : 0;
        }

        public String getGender() {
            return sex == 1 ? "男" : "女";
        }
    }

    // 父类构造调用顺序：父构造中经多态调子类方法，此时子类字段还是默认值 0
    static class OrderAnimal {
        OrderAnimal() {
            System.out.println("before sound");
            sound();
            System.out.println("after sound");
        }
        void sound() {
            System.out.println("I am an animal");
        }
    }

    static class OrderDog extends OrderAnimal {
        private int age;

        OrderDog(int age) {
            this.age = age;
            System.out.println("I am a dog, my age is " + this.age);
        }

        @Override
        void sound() {
            System.out.println("I am a dog, my age is " + this.age);
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        System.out.println(person.getName() + " " + person.getAge());
        person.setAge(-1);  // 拦下

        GenderPerson genderPerson = new GenderPerson();
        genderPerson.setGender("女");
        System.out.println("性别：" + genderPerson.getGender());

        new OrderDog(2);
    }
}
