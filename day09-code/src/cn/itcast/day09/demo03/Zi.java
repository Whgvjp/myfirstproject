package cn.itcast.day09.demo03;

public class Zi extends Fu {

    int num = 20;
    public void method(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

}
