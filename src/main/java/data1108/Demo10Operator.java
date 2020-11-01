package data1108;

public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max;
        max = b >= a ? b:a;
        System.out.println("最大值：" + max);
        System.out.println(b >= a ? b:a);
        //以下不行，会编译报错，他不能保证会传进去2.5还是10，但是前面限定是int所以不对。
        //int result = 3 > 4 ? 2.5 : 10;
    }
}
