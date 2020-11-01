package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随机抽取一个给自己
        //随机获取一个list集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包给自己
        Integer delta = list.remove(index); //变动金额
        //当前成员本来的钱
        int money = super.getMoney();
        super.setMoney(money + delta);

    }

}
