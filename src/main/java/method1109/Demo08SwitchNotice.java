package method1109;

public class Demo08SwitchNotice {
    public static void main(String[] args) {

        int num = 2;
        switch (num){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                //break;        //导致结果是 “周二、周三”
            case 3:
                System.out.println("周三");
                break;
            default:
                System.out.println("周几");
                break;
        }
    }
}
