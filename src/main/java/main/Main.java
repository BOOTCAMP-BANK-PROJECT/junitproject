package main;

import money.MoneyUtil;

public class Main {

    public static void main(String[] args) {

        double salary = 1000;

        System.out.println(MoneyUtil.formatDollar(salary));
    }

}
