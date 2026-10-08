// 第9.2集：List 接口（有序、可重复、有索引）
// 特有方法：add(索引,元素)、get、set、remove(索引)、indexOf、lastIndexOf、subList
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // 1. ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("初始的 ArrayList: " + arrayList);

        // 在指定位置插入元素
        arrayList.add(1, "Blueberry");
        System.out.println("在索引 1 插入元素后的 ArrayList: " + arrayList);

        // 访问指定位置元素
        String element = arrayList.get(2);
        System.out.println("索引 2 处的元素：" + element);

        // 替换指定索引元素
        arrayList.set(3, "Dragon fruit");
        System.out.println("修改索引 3 元素后的 ArrayList: " + arrayList);

        // 删除元素
        arrayList.remove("Banana");
        System.out.println("删除 'Banana' 后的 ArrayList: " + arrayList);

        // indexOf / lastIndexOf / subList
        System.out.println("Blueberry 的索引：" + arrayList.indexOf("Blueberry"));
        System.out.println("不存在元素的索引：" + arrayList.indexOf("Peach"));  // -1
        System.out.println("子列表 [0,2)：" + arrayList.subList(0, 2));       // 左闭右开

        // 增强 for 遍历
        for (String item : arrayList) {
            System.out.println(item);
        }

        // 2. LinkedList：List 的另一种实现
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Orange");
        linkedList.add("Apple");
        linkedList.add("Banana");
        System.out.println("LinkedList: " + linkedList);

        linkedList.add(1, "Mango");  // 指定位置插入
        linkedList.remove(2);        // 删除指定索引元素
        System.out.println("修改后的 LinkedList: " + linkedList);
    }
}
