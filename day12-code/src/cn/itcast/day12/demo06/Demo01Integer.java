package cn.itcast.day12.demo06;

/*

 */
public class Demo01Integer {
    public static void main(String[] args) {
        Integer it1 = new Integer(1);
        System.out.println(it1);

        Integer it2 = new Integer("1");
        System.out.println(it2);

        Integer it3 = Integer.valueOf(1);
        System.out.println(it3);

        Integer it4 = Integer.valueOf("1");
        System.out.println(it4);

        //拆箱
        int i = it1.intValue();
        System.out.println(i);
    }
}
