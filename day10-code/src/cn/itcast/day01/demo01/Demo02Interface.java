package cn.itcast.day01.demo01;

/*
1.接口的默认方法，可以通过接口实现类对象，直接调用。
2.接口的默认方法，也可以被接口实现类进行覆盖重写。
 */
public class Demo02Interface {

    public static void main(String[] args) {
        //创建实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); //调用抽象方法，实际运行右侧实现类

        //调用默认方法，如果没有会向上找借口中的方法。
        a.methodDeault();
        System.out.println("=====================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDeault();
    }

}
