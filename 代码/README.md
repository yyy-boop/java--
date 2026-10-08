# Java 复习代码

整理自 B 站视频《Java 基础知识点速通》（BV1Nmd5YYEWK），共 **13 个可独立运行的 Java 文件**，按 10 个部分分文件夹存放。
已用 JDK 17 逐一完成编译与运行验证（代码本身兼容 Java 8）。

## 目录结构

| 文件夹 | 文件 | 内容 |
| --- | --- | --- |
| P01_HelloWorld | Main.java | 第一个程序、程序入口 |
| P02_数据类型与类型转换 | AutoConversion.java | 基本类型、隐式/放大转换、表达式提升 |
|  | ForceCastDemo.java | 包装类型、强制转换、溢出 |
| P03_基本语法 | BasicGrammar.java | 运算符、循环语句、分支语句 |
| P04_String | StringBasic.java | 常用方法、拼接、转义 |
|  | StringMore.java | 信息获取、比较、修改、分割拼接、判断、子串 |
| P05_数组 | ArrayStudy.java | 数组声明/遍历/多维数组、sort/copyOf/fill/equals/toString |
| P06_面向对象 | OOPDemo.java | 类的结构、访问修饰符、构造方法 |
| P07_封装继承多态 | EncapsulationDemo.java | 封装、性别转换、父类构造调用顺序 |
|  | InheritancePolymorphism.java | 继承（super/重写/final）、多态（转型/instanceof） |
| P08_抽象类接口内部类 | AbstractInterfaceInner.java | 抽象类、接口（default/静态方法）、四种内部类 |
| P09_集合 | CollectionStudy.java | Collection、List、Set 及集合运算 |
| P10_泛型 | GenericExample.java | 泛型类、泛型接口、泛型方法 |

## 运行方式

进入文件所在目录，单独编译运行：

```
javac -encoding UTF-8 文件名.java
java 文件名（不含 .java）
```

例如：

```
cd P07_封装继承多态
javac -encoding UTF-8 InheritancePolymorphism.java
java InheritancePolymorphism
```

> 说明：
> 1. 视频中无法编译的演示片段（如 `byte = 128`、抽象类实例化、继承 final 类等）均以注释形式保留。
> 2. 第 7 集 `setAge` 的 int 字段配 `String.valueOf` 的重构中间态本身不能编译，已按讲解意图整理为可运行版本。
> 3. 第 9.3 集视频画面的 `remove("Two")` 与 Integer 集合类型不匹配（无效果），代码中改为可演示的写法并加注释。
