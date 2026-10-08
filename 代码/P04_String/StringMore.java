// 第4.2集：String 补充——信息获取、比较、修改、分割拼接、判断、子串
public class StringMore {
    public static void main(String[] args) {
        // 获取字符串信息
        String str = "Hello Java";
        System.out.println("长度：" + str.length());        // 10
        System.out.println("charAt(7)：" + str.charAt(7)); // J
        System.out.println("indexOf：" + str.indexOf("Java"));    // 7
        System.out.println("lastIndexOf：" + str.lastIndexOf("Java")); // 7

        // 比较内容：== 比地址，equals 比内容
        System.out.println("Java".equals("java"));                  // false
        System.out.println("Java".equalsIgnoreCase("java"));        // true

        // 修改
        System.out.println("Hello World".toLowerCase()); // hello world
        System.out.println("Hello World".toUpperCase()); // HELLO WORLD
        System.out.println("  Hello Java  ".trim() + "-"); // Hello Java-
        System.out.println("Hello Java".replace('J', 'L'));      // Hello Lava
        System.out.println("Hello Java".replace("Java", "Python")); // Hello Python

        // 分割与拼接
        String[] parts = "apple,banana,cherry".split(",");
        for (String part : parts) {
            System.out.print(part + " "); // apple banana cherry
        }
        System.out.println();
        System.out.println(String.join("-", "2025", "10", "05")); // 2025-10-05

        // 判断
        String sentence = "Hello Java";
        System.out.println(sentence.startsWith("Hello")); // true
        System.out.println(sentence.endsWith("Java"));    // true
        System.out.println("".isEmpty());                // true

        // 子串：左闭右开
        System.out.println("Hello, Java!".substring(7, 11)); // Java
    }
}
