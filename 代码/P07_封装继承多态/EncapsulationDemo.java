// 第7集：封装
// 把字段私有，通过 getter/setter 受控访问，并在 set 中加校验
public class EncapsulationDemo {

    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0 && age < 300) {
                this.age = age;
            } else {
                System.out.println("年龄必须为正数且小于300");
            }
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());

        person.setAge(-1);   // 非法年龄，被校验拦下
        person.setAge(400);  // 同样拦下
    }
}
