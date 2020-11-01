package cn.itcast.day11.demo06;

import cn.itcast.day11.demo03.Body;

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();

        hero.setName("盖伦");
        hero.setAge(20);
        Weapon weapon = new Weapon("AK-47");
        hero.setWeapon(weapon);

        //年龄为：20的盖伦用多兰剑攻击敌方
        hero.attck();
    }

}
