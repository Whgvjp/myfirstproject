package method1109;

public class Demo16DeadLoop {
    public static void main(String[] args) {
        while (true){
            System.out.println("hello");
        }
        //下面这行会编译报错，因为他知道下面这行没有执行的可能性
        //System.out.println("hello");
    }
}
