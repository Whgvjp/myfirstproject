package cn.itcast.day01.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother(){
        //直接访问到了接口当中的默认方法，这样是错误的
        //因为这个方法本来是为了解决另两个方法重复代码部分，不是为了单独使用
        //methodCommon();
    }

}
