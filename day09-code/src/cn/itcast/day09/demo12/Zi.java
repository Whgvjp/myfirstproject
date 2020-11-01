package cn.itcast.day09.demo12;

public class Zi extends Fu {

    public Zi(){
        //super()
        System.out.println("子类构造方法！");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭！");
    }
}
