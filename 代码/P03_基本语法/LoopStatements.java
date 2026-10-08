// 第3集：基本循环语句（for、增强 for、while、do-while）
public class LoopStatements {
    public static void main(String[] args) {
        // **** 基本循环语句 ****
        System.out.println("**** 基本循环语句 ****");

        // 1. for 循环
        System.out.println("for 循环：");
        for (int i = 0; i < 5; i++) {
            System.out.println("当前值：" + i);
        }

        // 2. 增强型 for 循环（for-each）
        System.out.println("增强型 for 循环：");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("数字：" + num);
        }

        // 3. while 循环（先判断后执行）
        System.out.println("while 循环：");
        int j = 0;
        while (j < 5) {
            System.out.println("当前值：" + j);
            j++;
        }

        // 4. do-while 循环（先执行后判断，至少执行一次）
        System.out.println("do-while 循环：");
        int k = 0;
        do {
            System.out.println("当前值：" + k);
            k++;
        } while (k < 5);
    }
}
