// 第4.2集：提取子串 substring，规则为左闭右开（含 begin，不含 end）
public class SubstringDemo {
    public static void main(String[] args) {
        // ==== 字符串提取 ====
        System.out.println("==== 字符串提取 ====");

        String text = "Hello, Java!";
        String subText = text.substring(7, 11);
        System.out.println("提取的子字符串：" + subText); // 输出：Java
    }
}
