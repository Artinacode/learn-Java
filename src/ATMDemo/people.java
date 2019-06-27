package ATMDemo;

import java.util.ArrayList;

public class people {
   private int id;
   private String name;
   private int pwd;
   private boolean vip;
   private double money;

    public people(int id, String name, int pwd, boolean vip, double money) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.vip = vip;
        this.money = money;
    }

    public people() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPwd() {
        return pwd;
    }

    public boolean isVip() {
        return vip;
    }

    public double getMoney() {
        return money;
    }
    public  void display(){
        System.out.println("ID:"+getId());
        System.out.println("Name:"+getName());
        System.out.println("Money:"+getMoney()+"￥");
    }


    }

