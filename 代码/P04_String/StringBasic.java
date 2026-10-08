public class StringBasic {
    public static void main(String[] args) {
        String a = "Hello World ";

        // 常用方法
        System.out.println(a.length());      // 12
        System.out.println(a.toLowerCase()); // hello world
        System.out.println(a.toUpperCase()); // HELLO WORLD
        System.out.println(a.trim());        // Hello World 去掉开头结尾空白字符
        System.out.println(a.indexOf("o"));  // 4

        // 拼接：+ 从左向右结合
        System.out.println("a" + "b");   // ab
        System.out.println("a" + 1);     // a1
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12

        // 转义字符
        System.out.println("abc\"d"); // abc"d
        System.out.println("abc\n");  // 换行
        System.out.println("abc\t");  // 制表符
        System.out.println("abc\bd"); // 退格后打印 d，覆盖 c
    }
}
