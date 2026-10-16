package com.moon.yunsuanfu;

public class Test10 {
    /**
     * 练习
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        boolean res = ++x > 5 & y-- < 4;
//        boolean res = ++x > 5 && y-- < 4;

        System.out.println(res);
        System.out.println(x);
        System.out.println(y);
    }
}
