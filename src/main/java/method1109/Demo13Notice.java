package method1109;

/**
 * 在给变量进行赋值的时候，如果右侧的表达式当中全部是常量，没有任何变量，
 * 那么编译器javac将会直接将若干个常量表达式计算得到结果
 * 例如下面的例子，编译后，得到的 .class 字节码文件当中相当于【直接就是】
 * short result = 13;
 * 右侧的常量结果数值，没有超过左侧范围，所以正确。
 * 但是如果表达式当中有变量参与，那就不能进行这种优化了。因为变量可能会变。
 */
public class Demo13Notice {
    public static void main(String[] args) {
        short num1 = 10;    //正确写法，右侧没有超过左侧范围

        short a = 5;
        short b = 8;
        //short + short --> int + int --> int
        //short result = a + b; //错误写法，左侧需要时int类型
        short result = 5 + 8;   //这样就不会报错。
        System.out.println(result);

    }
}
