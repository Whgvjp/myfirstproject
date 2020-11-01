package data1108;

public class Demo02Variable {
    public static void main(String[] args) {
        //创建一个变量
        //格式： 数据类型   变量名称
        int num1;
        //向变量当中存入一个数据
        num1 = 10;
        System.out.println(num1);       //结果是 10
        num1 = 20;
        System.out.println(num1);       //结果是 20

        int num2 = 30;  //  不能创建重复的变量
        System.out.println(num2);
        num2 = 35;
        System.out.println(num2);
        System.out.println("========================================================================================");
        byte num3 = 30;
        System.out.println(num3);
        //byte num4 = 400;
        long num6 = 20000000000L;   //不加的话就超出long范围了。
        System.out.println(num6);

        float num7 = 2.5F;  //默认是double所以必须要加上F不然报错。 需要Float，找到Double
        System.out.println(num7);

        double num8 = 1.3;      //这个就不用加
        System.out.println(num8);

        char zifu1 = 'A';
        char zifu2 = '中';
        System.out.println(zifu1);
        System.out.println(zifu2);
        boolean var1 = true;
        System.out.println(var1);
        boolean var2 = var1;
        System.out.println(var2);
        //System.out.println(zifu3);  必须要先定义再使用，程序是从上往下执行的。
        char zifu3 = 23333;
        System.out.println(zifu3);

        int numt; //必须要先赋值。不然不能直接使用
        //System.out.println(numt);
        int a = 10, b = 20, c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




    }
}
