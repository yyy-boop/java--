// 第6集：用 MyCar 演示属性的访问修饰符
// private 本类；default 同包；protected 同包+不同包子类；public 所有类
public class MyCar {
    private String model;     // 私有属性，只能在 MyCar 类中访问
    protected String year;    // 受保护属性，同一包或不同包的子类
    String type;              // 默认属性，同一个包中可以访问
    public String price;      // 公共属性，所有类都可以访问

    public static void main(String[] args) {
        MyCar car = new MyCar();
        car.model = "Model 3";   // 在本类内部可以访问 private
        car.year = "2024";
        car.type = "SUV";
        car.price = "30万";

        System.out.println("model = " + car.model);
        System.out.println("year = " + car.year);
        System.out.println("type = " + car.type);
        System.out.println("price = " + car.price);
    }
}
