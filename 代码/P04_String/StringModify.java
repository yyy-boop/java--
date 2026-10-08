// 第4.2集：字符串修改（大小写、去空格、替换字符/子串）
public class StringModify {
    public static void main(String[] args) {
        // ==== 字符串修改 ====
        System.out.println("==== 字符串修改 ====");

        String mixedCase = "Hello World";
        String lowerCase = mixedCase.toLowerCase();
        String upperCase = mixedCase.toUpperCase();
        System.out.println("小写：" + lowerCase); // 输出：hello world
        System.out.println("大写：" + upperCase); // 输出：HELLO WORLD

        String withSpaces = "  Hello Java  ";
        String trimmed = withSpaces.trim();
        System.out.println("去除空格后：" + trimmed + "-"); // 输出：Hello Java-

        String original = "Hello Java";
        String replacedChar = original.replace('J', 'L');
        String replacedString = original.replace("Java", "Python");
        System.out.println("替换字符：" + replacedChar);    // 输出：Hello Lava
        System.out.println("替换子串：" + replacedString); // 输出：Hello Python
    }
}
