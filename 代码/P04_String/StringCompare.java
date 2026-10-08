// 第4.2集：字符串内容比较
// String 是引用类型，== 比较的是地址；比较内容用 equals / equalsIgnoreCase
public class StringCompare {
    public static void main(String[] args) {
        // ==== 字符串比较 ====
        System.out.println("==== 字符串比较 ====");

        String str1 = "Java";
        String str2 = "java";
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("区分大小写比较：" + isEqual);           // 输出：false
        System.out.println("忽略大小写比较：" + isEqualIgnoreCase); // 输出：true
    }
}
