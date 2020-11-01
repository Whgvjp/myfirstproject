package cn.itcast.day09.demo07;

public class Zi extends Fu {

    public Zi(){
        //super(); //在调用父类无参构造方法，写不写都会默认存在
        super(10);//在调用父类重载的有参构造方法，必须有，不然报错，因为会默认有上面那个
        System.out.println("子类构造方法！");
    }
    public void method(){
        //super(); 错误写法！只有子类构造方法，才能调用父类构造方法。
    }

}
