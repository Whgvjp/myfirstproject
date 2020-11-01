package cn.itcast.day01.demo01;

/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法：通过接口名称，直接调用其中的静态方法。
格式：
接口名称.静态方法名(参数);
 */
public class Demo03Interface {

    public static void main(String[] args) {
        //这个没有必要，因为静态方法，都是通过类名，或者接口名称调用，不用创建对象
        MyInterfaceStatic impl = new MyInterfaceStaticImpl();

        //错误写法！
        //impl.methodStatic();

        //通过接口名称调用静态方法。
        MyInterfaceStatic.methodStatic();
    }

}
