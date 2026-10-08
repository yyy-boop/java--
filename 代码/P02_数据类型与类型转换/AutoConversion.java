public class AutoConversion {
    public static void main(String[] args) {
        int myInt = 3;
        float myFloat1 = myInt;
        char myChar = 'A';
        int myInt2 = myChar;       // char 自动转为对应的 ASCII 码
        float myFloat2 = myChar;

        System.out.println("myFloat1 = " + myFloat1);  // 输出 3.0，float 类型
        System.out.println("myInt2 = " + myInt2);      // 65
        System.out.println("myFloat2 = " + myFloat2);  // 65.0

        long myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        System.out.println("myNum = " + myNum);
        System.out.println("myFloat = " + myFloatNum);
        System.out.println("myLetter = " + myLetter);
        System.out.println("myBool = " + myBool);

        // byte 只占 1 字节，范围 -128 ~ 127，下面这行无法通过编译：
        // byte overflow = 128;  // 报错：已超出 byte 可表示的范围

        float myFloat3 = 1.5f;
        double myDouble = 1.2;
        int num1 = 2;
        int num2 = 3;
        double res = myFloat3 * num1 + myDouble * num2;
        System.out.println(res);  // double 类型
    }
}
