// 第4.2集：字符串判断（前缀/后缀、是否为空串）
public class StringJudge {
    public static void main(String[] args) {
        // ==== 字符串判断 ====
        System.out.println("==== 字符串判断 ====");

        String sentence = "Hello Java";
        boolean startsWithHello = sentence.startsWith("Hello");
        boolean endsWithJava = sentence.endsWith("Java");
        System.out.println("以\"Hello\"开头：" + startsWithHello); // 输出：true
        System.out.println("以\"Java\"结尾：" + endsWithJava);     // 输出：true

        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println("是否为空字符串：" + isEmpty); // 输出：true
    }
}
