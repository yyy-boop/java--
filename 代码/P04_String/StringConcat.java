// 第4.1集：字符串拼接，+ 从左向右结合
public class StringConcat {
    public static void main(String[] args) {
        // 2. 字符串拼接
        System.out.println("a" + "b");      // 输出：ab
        System.out.println("a" + 1);        // 输出：a1
        System.out.println(1 + 2 + "c");    // 先加后拼，输出：3c
        System.out.println("c" + 1 + 2);    // 一直拼接，输出：c12
    }
}
