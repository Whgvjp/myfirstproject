package method1109;

public class Demo17LoopHourAndMinute {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++){

            for (int minute = 0; minute < 60; minute++){
                System.out.println(hour + "点" + minute + "分");
            }
        }
    }
}
