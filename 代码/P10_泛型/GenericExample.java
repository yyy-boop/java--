// 第10集：泛型
// 声明类/接口/方法时类型不确定，用 <T> 占位，创建对象或调用时再确定具体类型
import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    // 1. 泛型类：存储任意类型的数据
    public static class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    // 2. 泛型接口：可存储和获取元素的容器
    public interface Container<T> {
        void add(T item);
        T get(int index);
    }

    // 实现类：专门存储字符串
    public static class StringContainer implements Container<String> {
        private List<String> items = new ArrayList<>();

        @Override
        public void add(String item) {
            items.add(item);
        }

        @Override
        public String get(int index) {
            return items.get(index);
        }
    }

    // 3. 泛型方法：打印任意类型的数组
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // 测试泛型类
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("泛型类 Box<Integer> 存储的值：" + integerBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("泛型类 Box<String> 存储的值：" + stringBox.getItem());

        // 测试泛型接口
        Container<String> container = new StringContainer();
        container.add("Item 1");
        container.add("Item 2");
        System.out.println("泛型接口 Container<String> 获取的值：" + container.get(0));

        // 测试泛型方法
        Integer[] intArray = {1, 2, 3};
        System.out.println("泛型方法 printArray(Integer[])：");
        printArray(intArray);

        String[] stringArray = {"A", "B", "C"};
        System.out.println("泛型方法 printArray(String[])：");
        printArray(stringArray);
    }
}
