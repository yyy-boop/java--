public class BasicGrammar {
    public static void main(String[] args) {
        // **** 运算符 ****
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3（int 相除舍弃小数，b 改 float 则为 3.3333333）
        System.out.println("a % b = " + (a % b)); // 1
        System.out.println("a > b = " + (a > b)); // true
        System.out.println("a == b = " + (a == b)); // false
        System.out.println("a != b = " + (a != b)); // true

        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y)); // false
        System.out.println("x || y = " + (x || y)); // true
        System.out.println("!x = " + (!x));         // false

        int c = 5;
        c += 3;
        System.out.println("c += 3 -> " + c); // 8

        int num1 = 10, num2 = 20;
        System.out.println("较大数：" + ((num1 > num2) ? num1 : num2)); // 20

        // **** 循环语句 ****
        for (int i = 0; i < 5; i++) {
            System.out.println("for 当前值：" + i);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("增强 for：" + num);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("while 当前值：" + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("do-while 当前值：" + k);
            k++;
        } while (k < 5);

        // **** 分支语句 ****
        int score = 85;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("未知日期");
        }
    }
}
