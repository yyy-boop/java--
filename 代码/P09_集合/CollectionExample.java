// 第9.1集：Collection 根接口的常用方法与两种遍历方式
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {
        // 1. 创建一个 Collection 实例（使用 ArrayList）
        Collection<String> collection = new ArrayList<>();

        // 2. 添加元素
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        System.out.println("初始的 Collection: " + collection);

        // 3. 是否为空
        boolean isEmpty = collection.isEmpty();
        System.out.println("集合是否为空： " + isEmpty);

        // 4. 大小
        int size = collection.size();
        System.out.println("集合的大小： " + size);

        // 5. 是否包含某个元素
        boolean containsBanana = collection.contains("Banana");
        System.out.println("集合是否包含 'Banana': " + containsBanana);

        // 6. 删除元素
        collection.remove("Banana");
        System.out.println("删除 'Banana' 后的 Collection: " + collection);

        // 7. 增强型 for 遍历
        System.out.println("使用增强型 for 循环遍历集合：");
        for (String item : collection) {
            System.out.println(item);
        }

        // 8. Iterator 遍历
        System.out.println("使用 Iterator 遍历集合：");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        // 9. 清空
        collection.clear();
        System.out.println("清空后的 Collection: " + collection);

        // 10. HashSet 也是 Collection 的一种实现
        Collection<String> hashSetCollection = new HashSet<>();
        hashSetCollection.add("Orange");
        hashSetCollection.add("Apple");
        hashSetCollection.add("Banana");
        System.out.println("HashSet Collection: " + hashSetCollection);
    }
}
