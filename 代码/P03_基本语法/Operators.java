// 第3集：算术、关系、逻辑、赋值与三元运算符
public class Operators {
    public static void main(String[] args) {
        // **** 基本运算符 ****
        System.out.println("**** 基本运算符 ****");

        // 1. 算术运算符
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b)); // 加法 -> 13
        System.out.println("a - b = " + (a - b)); // 减法 -> 7
        System.out.println("a * b = " + (a * b)); // 乘法 -> 30
        System.out.println("a / b = " + (a / b)); // 除法 -> 3（int 相除舍弃小数）
        System.out.println("a % b = " + (a % b)); // 取模 -> 1

        // 把 b 改为 float b = 3f; 后：a / b = 3.3333333，a * b = 30.0，a % b = 1.0

        // 2. 关系运算符
        System.out.println("a > b = " + (a > b)); // 大于
        System.out.println("a < b = " + (a < b)); // 小于
        System.out.println("a == b = " + (a == b)); // 等于
        System.out.println("a != b = " + (a != b)); // 不等于

        // 3. 逻辑运算符
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y)); // 与
        System.out.println("x || y = " + (x || y)); // 或
        System.out.println("!x = " + (!x)); // 非

        // 4. 赋值运算符
        int c = 5;
        c += 3; // 等效于 c = c + 3
        System.out.println("c + 3 = " + c); // 输出：8

        // 5. 三元运算符
        int num1 = 10, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("较大数是：" + max); // 输出：20
    }
}
