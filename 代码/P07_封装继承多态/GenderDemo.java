// 第7集：隐藏实现细节
// 性别在数据库中存 0/1，对外通过封装展示为 "男"/"女"
public class GenderDemo {

    static class Person {
        private int sex;  // 数据库中：1 男，0 女

        // 存入 "男"/"女" 时转换为 0/1
        public void setGender(String gender) {
            this.sex = "男".equals(gender) ? 1 : 0;
        }

        // 取出时把 0/1 转换为 "女"/"男"
        public String getGender() {
            if (sex == 1) {
                return "男";
            } else {
                return "女";
            }
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setGender("女");
        System.out.println("性别：" + person.getGender());  // 女

        person.setGender("男");
        System.out.println("性别：" + person.getGender());  // 男
    }
}
