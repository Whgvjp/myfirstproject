package cn.itcast.day06.demo03;

public class Demo03Person {

    public static void main(String[] args) {
    Person person = new Person();
    person.show();

    person.name = "赵丽颖";
    //person.age = 18;
    person.setAge(18);
    person.show();

    }

}
