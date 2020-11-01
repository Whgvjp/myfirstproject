package method1109;
/*
do-while 循环的标准格式：

do{
    循环体;
}while(条件判断);

扩展格式：

初始化语句;
do{
    循环体;
    步进语句;
}while(条件判断);

 */
public class Demo11DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println("春眠不觉晓" + i);
            i++;
        }while (i <= 100);
    }
}

