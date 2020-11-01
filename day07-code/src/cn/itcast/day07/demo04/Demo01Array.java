package cn.itcast.day07.demo04;
/*
定义一个数组，用来存储3个Person对象

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {

    public static void main(String[] args) {
        Person[] array = new Person[3];
        System.out.println(array[0]);

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",20);
        Person three = new Person("马尔扎哈",38);
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].getName());

        Person person = array[1];
        System.out.println(person.getName());

    }

}
