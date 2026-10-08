// 第8集：四种内部类
// 成员内部类、静态内部类、局部内部类、匿名内部类
public class InnerClassDemo {
    // 成员内部类（非静态）
    class MemberInnerClass {
        public void display() {
            System.out.println("This is a member inner class");
        }
    }

    // 静态内部类
    static class StaticNestedClass {
        public void display() {
            System.out.println("This is a static nested class");
        }
    }

    // 方法中演示局部内部类和匿名内部类
    public void createLocalAndAnonymousClasses() {
        // 局部内部类
        class LocalInnerClass {
            public void display() {
                System.out.println("This is a local inner class");
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();

        // 匿名内部类
        Runnable anonymousInner = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous inner class");
            }
        };
        anonymousInner.run();
    }

    public static void main(String[] args) {
        InnerClassDemo outer = new InnerClassDemo();

        // 成员内部类：需先有外部对象，用 outer.new 创建
        InnerClassDemo.MemberInnerClass memberInner = outer.new MemberInnerClass();
        memberInner.display();

        // 静态内部类：不需要外部实例
        InnerClassDemo.StaticNestedClass staticNested = new InnerClassDemo.StaticNestedClass();
        staticNested.display();

        // 局部内部类与匿名内部类
        outer.createLocalAndAnonymousClasses();
    }
}
