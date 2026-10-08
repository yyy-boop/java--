// 第4.1集：String 声明与常用方法
// String 是引用数据类型，类名大写开头，拥有自己的方法
public class StringBasicMethods {
    public static void main(String[] args) {
        String a = "Hello World ";

        // 1. 字符串方法
        System.out.println(a.length());      // 输出：12
        System.out.println(a.toLowerCase()); // hello world
        System.out.println(a.toUpperCase()); // HELLO WORLD
        System.out.println(a.trim());        // Hello World
        System.out.println(a.indexOf("o"));  // 输出：4（第一个 o 在索引 4；视频口播的 13/8 与画面字符串不符）
    }
}
