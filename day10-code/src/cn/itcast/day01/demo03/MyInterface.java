package cn.itcast.day01.demo03;

/*
这个子接口当中有几个方法？答：4个。
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A和B
method 来源于自己
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();


    @Override
    default void methodDefault() {
        System.out.println("实现冲突的默认方法");
    }
}
