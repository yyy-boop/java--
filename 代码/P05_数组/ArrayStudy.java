// 第5集：数组
// 数组长度固定、只能存同一种类型、下标从 0 开始；Arrays 的常用方法
import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
        // 1. 声明并初始化一个数组
        // int[] numbers = new int[5];            // 动态初始化
        int[] numbers = {10, 20, 30, 40, 10};    // 静态初始化
        System.out.println("初始化的数组：");
        printArray(numbers);

        // 2. 访问数组元素
        System.out.println("\n访问数组元素：");
        System.out.println("numbers[0]：" + numbers[0]);  // 输出第一个元素
        System.out.println("numbers[2]：" + numbers[2]);  // 输出第三个元素

        // 3. 修改数组元素
        numbers[2] = 25;  // 通过下标修改元素
        System.out.println("\n修改后的数组：");
        printArray(numbers);

        // 4. 获取数组长度（length 是属性，不是方法）
        System.out.println("\n数组的长度：" + numbers.length);

        // 5. 普通 for i 循环按下标遍历
        System.out.println("\n遍历数组：");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + "：" + numbers[i]);
        }

        // 6. 增强型 for 循环遍历
        System.out.println("\n使用增强型 for 循环遍历数组：");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 7. 多维数组的静态初始化
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\n二维数组 matrix：");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 常用数组方法
        // 1. 排序（底层快速排序，升序）
        Arrays.sort(numbers);
        System.out.println("\n排序后的数组：");
        printArray(numbers);

        // 2. 复制：= 是浅拷贝（同一地址）；Arrays.copyOf 重新开辟内存
        int[] shallowCopy = numbers;                                     // 浅拷贝
        int[] copiedArray1 = Arrays.copyOf(numbers, numbers.length);     // 完整复制
        int[] copiedArray2 = Arrays.copyOf(numbers, 3);                  // 只复制前三个元素
        int[] copiedArray3 = Arrays.copyOf(numbers, numbers.length + 3); // 超出长度补 0
        numbers[1] = 99;
        System.out.println("\n复制后的数组：");
        printArray(shallowCopy);   // 与 numbers 同一地址，跟着变成 99
        printArray(copiedArray1);  // 深拷贝，不受影响
        printArray(copiedArray2);  // 只取前三个
        printArray(copiedArray3);  // 长度 +3，后面补 0

        // 3. 填充
        Arrays.fill(copiedArray1, 10);
        System.out.println("\n填充后的数组：");
        printArray(copiedArray1);

        // 4. 比较内容
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("\narray1 和 array2 是否相等：" + isEqual);  // true

        boolean isSame = Arrays.equals(shallowCopy, numbers);
        System.out.println("shallowCopy 和 numbers 相等吗：" + isSame);  // true（同一地址）

        // 5. 数组转字符串
        System.out.println("\n将数组转换为字符串：");
        System.out.println(Arrays.toString(numbers));

        // 6. 多维数组要用 deepToString，toString 只会打印内层地址
        System.out.println("\n二维数组 matrix：");
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));
    }

    // 打印一维数组的方法（for each）
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
