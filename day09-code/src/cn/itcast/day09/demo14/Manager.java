package cn.itcast.day09.demo14;

import java.util.ArrayList;

//群主的类
public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send (int totalMoney, int count){
        //需要一个集合，存储若干红包金额。
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看群主有多少钱
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足！");
            return redList; //返回空集合
        }

        //扣钱，其实就是重新设置金额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，就是拆分后的零头
        //剩下的零头包在最后一个红包当中
        //下面把红包放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);
        return redList;

    }

}
