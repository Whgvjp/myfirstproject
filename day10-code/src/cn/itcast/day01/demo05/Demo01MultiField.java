package cn.itcast.day01.demo05;

/*
访问成员变量的两种方式：

1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 */
public class Demo01MultiField {

    public static void main(String[] args) {
        //使用多态写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);    //10
        //System.out.println(obj.age); // 错误写法
        obj.showNum();  //20
    }

}
