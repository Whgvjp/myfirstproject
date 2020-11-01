package method1109;

public class Demo14Break {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i == 4){
                break;
            }
            System.out.println("你好" + i);
        }
    }
}
