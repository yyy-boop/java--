// 第4.1/4.2集：特殊字符转义
// \" 双引号  \n 换行  \t 制表符  \b 退格  \r 回车  \\ 反斜杠
public class StringEscape {
    public static void main(String[] args) {
        System.out.println("abc\"d"); // 输出：abc"d
        System.out.println("abc\n");  // abc 后换行
        System.out.println("abc\t");  // abc 后输出制表符
        System.out.println("abc\bd"); // \b 退格后再打印 d，覆盖 c
        System.out.println("abc\r");  // \r 回车回到行首
        System.out.println("abc\\");  // 输出反斜杠：abc\
    }
}
