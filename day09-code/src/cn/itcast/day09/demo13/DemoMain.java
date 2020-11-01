package cn.itcast.day09.demo13;

public class DemoMain {

    public static void main(String[] args) {
        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
        System.out.println("==================");
        DogGolden dogGolden = new DogGolden();
        dogGolden.eat();
        dogGolden.sleep();
    }
}
