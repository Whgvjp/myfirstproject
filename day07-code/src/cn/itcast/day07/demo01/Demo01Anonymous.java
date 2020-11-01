package cn.itcast.day07.demo01;
/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

注意事项： 匿名对象只能使用唯一的一次，下次再用不得不重新再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */
public class Demo01Anonymous {

    public static void main(String[] args) {

        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("==============");
        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName(); // 我叫： null

    }

}
