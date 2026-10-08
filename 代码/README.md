# Java 复习资料

整理自 B 站视频《Java 基础知识点速通》（BV1Nmd5YYEWK），并补充了 Maven 基础。

每个部分文件夹中：
- 知识点.txt：该部分的纯文字知识点（每部分一个文件）；
- .java：对应的可运行代码，已用 JDK 17 逐一完成编译与运行验证（代码本身兼容 Java 8）。

## 目录结构

| 文件夹 | 知识点 | 代码文件 |
| --- | --- | --- |
| P01_HelloWorld | 知识点.txt | Main.java |
| P02_数据类型与类型转换 | 知识点.txt | AutoConversion.java、ForceCastDemo.java |
| P03_基本语法 | 知识点.txt | BasicGrammar.java |
| P04_String | 知识点.txt | StringBasic.java、StringMore.java |
| P05_数组 | 知识点.txt | ArrayStudy.java |
| P06_面向对象 | 知识点.txt | OOPDemo.java |
| P07_封装继承多态 | 知识点.txt | EncapsulationDemo.java、InheritancePolymorphism.java |
| P08_抽象类接口内部类 | 知识点.txt | AbstractInterfaceInner.java |
| P09_集合 | 知识点.txt | CollectionStudy.java |
| P10_泛型 | 知识点.txt | GenericExample.java |
| P11_Maven | 知识点.txt（视频外补充） | 无 |

## 运行代码

进入文件所在目录，单独编译运行：

```
javac -encoding UTF-8 文件名.java
java 文件名（不含 .java）
```

> 说明：
> 1. 视频中无法编译的演示片段（如 `byte = 128`、抽象类实例化、继承 final 类等）均以注释形式保留。
> 2. 第 7 集 `setAge` 的 int 字段配 `String.valueOf` 的重构中间态本身不能编译，已按讲解意图整理为可运行版本。
> 3. 第 9.3 集视频画面的 `remove("Two")` 与 Integer 集合类型不匹配（无效果），代码中改为可演示的写法并加注释。
