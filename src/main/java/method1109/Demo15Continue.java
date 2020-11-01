package method1109;

public class Demo15Continue {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i == 4){
                continue;   //跳过当前循环，就是下面不执行了，直接开始下一次循环
            }
            System.out.println(i + "层到了。");
        }
    }
}
