// 第4.2集：字符串分割与拼接
public class StringSplitJoin {
    public static void main(String[] args) {
        // ==== 字符串分割与拼接 ====
        System.out.println("==== 字符串分割与拼接 ====");

        String fruits = "apple,banana,cherry";
        String[] parts = fruits.split(",");
        System.out.println("分割后的字符串数组：");
        for (String part : parts) {
            System.out.print(part + " "); // 输出：apple banana cherry
        }
        System.out.println();

        String joined = String.join("-", "2025", "10", "05");
        System.out.println("拼接后的字符串：" + joined); // 输出：2025-10-05
    }
}
