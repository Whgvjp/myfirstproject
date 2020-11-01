package cn.itcast.day01.demo01;


public class MyInterfaceDefaultA implements MyInterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，AAA");
    }

    @Override
    public void methodDeault(){
        System.out.println("实现类A重写了借口默认的方法");
    }

}
