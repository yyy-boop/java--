// 第9.3集：Set 接口（无序、不重复、无索引）
// HashSet 无序；LinkedHashSet 保持插入顺序；TreeSet 自动排序
// 集合运算：addAll 并集、retainAll 交集、removeAll 差集
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // 1. HashSet：无序、不重复、无索引
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");  // 重复元素不会被添加

        System.out.println("HashSet 内容： " + hashSet);  // 输出顺序可能不同
        System.out.println("是否包含 'Banana'： " + hashSet.contains("Banana"));
        System.out.println("HashSet 大小： " + hashSet.size());  // 3

        // 2. LinkedHashSet：保持插入顺序
        System.out.println("\n==== LinkedHashSet 示例 ====");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(20);
        System.out.println("LinkedHashSet 内容： " + linkedHashSet);  // [10, 5, 20]
        linkedHashSet.remove(Integer.valueOf(5));  // 按元素删除（视频画面为 remove("Two")，类型不匹配，无效果）
        System.out.println("移除 5 后的内容： " + linkedHashSet);

        // 3. TreeSet：自动升序排序
        System.out.println("\n==== TreeSet 示例 ====");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(5);  // 重复元素不会被添加
        System.out.println("TreeSet 内容： " + treeSet);  // [5, 10, 20]
        System.out.println("第一个元素： " + treeSet.first());  // 5
        System.out.println("最后一个元素： " + treeSet.last()); // 20

        // 4. 集合运算
        System.out.println("\n==== 数字集合运算示例 ====");
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("并集： " + union);

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("交集： " + intersection);

        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("差集（setA - setB）： " + difference);
    }
}
