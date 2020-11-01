package cn.itcast.day01.demo07;

public class DemoMain {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        Mouse mouse = new Mouse();
        //首先向上转型
        USB usb = mouse;

        computer.useDevice(usb);
        //准备一个键盘，供电脑使用
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }

}
