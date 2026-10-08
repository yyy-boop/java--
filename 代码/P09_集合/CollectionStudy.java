import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionStudy {
    public static void main(String[] args) {
        // ==== Collection 根接口 ====
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        System.out.println("初始: " + collection);
        System.out.println("是否为空？" + collection.isEmpty());
        System.out.println("大小：" + collection.size());
        System.out.println("含 Banana？" + collection.contains("Banana"));
        collection.remove("Banana");
        for (String item : collection) { // 增强 for
            System.out.println(item);
        }
        Iterator<String> iterator = collection.iterator(); // 迭代器
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        collection.clear();
        System.out.println("清空后：" + collection);

        // ==== List：有序、可重复、有索引 ====
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Blueberry");       // 指定索引插入
        System.out.println(list.get(2)); // 访问
        list.set(3, "Dragon fruit");    // 替换
        list.remove("Banana");          // 删除
        System.out.println("indexOf：" + list.indexOf("Blueberry"));
        System.out.println("subList：" + list.subList(0, 2)); // 左闭右开
        System.out.println(list);

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Orange");
        linked.add(1, "Mango");
        linked.remove(0);
        System.out.println("LinkedList：" + linked);

        // ==== Set：无序、不重复、无索引 ====
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // 重复不添加
        System.out.println("HashSet：" + hashSet + " 大小：" + hashSet.size());

        Set<Integer> linkedSet = new LinkedHashSet<>(); // 保持插入顺序
        linkedSet.addAll(Arrays.asList(10, 5, 20));
        System.out.println("LinkedHashSet：" + linkedSet);

        TreeSet<Integer> treeSet = new TreeSet<>(); // 自动排序
        treeSet.addAll(Arrays.asList(10, 5, 20, 5));
        System.out.println("TreeSet：" + treeSet + " first：" + treeSet.first() + " last：" + treeSet.last());

        // 集合运算
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7));
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("并集：" + union);
        System.out.println("交集：" + intersection);
        System.out.println("差集：" + difference);
    }
}
