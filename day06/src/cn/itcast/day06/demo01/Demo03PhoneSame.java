package cn.itcast.day06.demo01;

public class Demo03PhoneSame {

    public static void main(String[] args) {

        Phone one = new Phone();
        System.out.println(one.brand);  //null
        System.out.println(one.price);  //0.0
        System.out.println(one.color);  //null
        System.out.println("===================");

        one.brand = "苹果";
        one.price = 8388;
        one.color = "黑色";
        System.out.println(one.brand);  //苹果
        System.out.println(one.price);  //8838.0
        System.out.println(one.color);  //黑色

        System.out.println("=============");
        one.call("乔布斯");
        one.sendMessage();

        //将one当中保存的对象地址赋值给two
        Phone two = one;
        System.out.println(two.brand);  //null
        System.out.println(two.price);  //0.0
        System.out.println(two.color);  //null
        System.out.println("===================");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand);  //三星
        System.out.println(two.price);  //5999.0
        System.out.println(two.color);  //蓝色

        System.out.println("=============");
        two.call("欧巴");
        two.sendMessage();

        System.out.println(one.brand);  //三星
    }

}
