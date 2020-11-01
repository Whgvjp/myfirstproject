package method1109;

public class Demo02If {
    public static void main(String[] args) {
        System.out.println("今天发现一网吧");
        int age = 11;
        if(age >= 18){
            System.out.println("进入网吧！");
        }
        else if(age >= 15){
            System.out.println("借个身份证");
        }else{
            System.out.println("哎，年龄不够");
        }
        System.out.println("回家吃饭");
    }
}
