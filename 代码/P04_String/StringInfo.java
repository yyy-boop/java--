// 第4.2集：获取字符串信息（长度、索引字符、首次/末次出现位置）
public class StringInfo {
    public static void main(String[] args) {
        // ==== 获取字符串信息 ====
        System.out.println("==== 获取字符串信息 ====");

        String str = "Hello Java";
        int length = str.length();
        System.out.println("字符串长度：" + length); // 输出：10

        char ch = str.charAt(7);
        System.out.println("索引 7 处的字符：" + ch); // 输出：J

        int firstIndex = str.indexOf("Java");
        int lastIndex = str.lastIndexOf("Java");
        System.out.println("第一次出现 Java 的位置：" + firstIndex);  // 输出：7
        System.out.println("最后一次出现 Java 的位置：" + lastIndex); // 输出：7
    }
}
