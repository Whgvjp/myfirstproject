package cn.itcast.day01.demo02;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法A");
    }

}
