
public class ForceCastDemo {
    public static void main(String[] args) {
        // 大类型 -> 小类型需手动加 (类型)，可能丢失精度；强转整个表达式要用括号括起来
        int myInt2 = 72;
        float myFloat4 = 2.1f;
        char myChar2 = (char) myInt2;

        // 错误写法：只强转了 myInt2，乘完 float 后结果仍是 float
        // myInt2 = (int) myInt2 * myFloat4;
        myInt2 = (int) (myInt2 * myFloat4);  // 正确：强转整个表达式

        System.out.println("myInt2 = " + myInt2);  // 72*2.1=151.2，截断为 151
        System.out.println("myChar2 = " + myChar2); // (char)72 = H


        // int 相加溢出后再转 long 已无意义；正确做法是相加前先把其中一个操作数转 long
        int a = 1500000000, b = 1500000000;
        int res1 = a + b;              // int 相加直接溢出
        long res2 = (long) (a + b);    // 先算 a+b（int 溢出），再强转 long，已无意义
        long res3 = (long) a + b;      // 先把 a 强转 long，b 自动提升为 long，结果正确
        long res4 = (long) (a + b);    // 同 res2

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);

        // 包装类型把基本数据类型变成对象，从而可以调用方法（equals、parseInt 等）
        // 包装类型的三种声明方式
        Integer integerValue1 = Integer.valueOf(22);   // valueOf
        Integer integerValue2 = Integer.valueOf(22);
        Integer integerValue3 = 3;                      // 直接赋值（自动装箱）
        System.out.println("integerValue1 = " + integerValue1);
        System.out.println("integerValue2 = " + integerValue2);
        System.out.println("integerValue3 = " + integerValue3);

        // 将字符串转换为 int 类型
        String numberString = "123";
        int parsedNumber = Integer.parseInt(numberString);
        System.out.println("parsedNumber = " + parsedNumber);

        // 数字比较：包装类型对象可以调用 equals
        Integer e = 10;
        Integer f = 20;
        System.out.println(e.equals(f));  // 输出 false
    }
}
