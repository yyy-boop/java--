// 第3集：基本分支语句（if / else if / else 与 switch）
public class BranchStatements {
    public static void main(String[] args) {
        // **** 基本分支语句 ****
        System.out.println("**** 基本分支语句 ****");

        // 1. if 分支
        System.out.println("if 分支：");
        int score = 85;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        // 2. switch 分支
        System.out.println("switch 分支：");
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
