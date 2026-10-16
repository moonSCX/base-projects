package com.moon.yunsuanfu;

public class Test05 {
    /**
     * 练习: 阅读代码,说出控制台打印结果
     * @param args
     */
    public static void main(String[] args) {
        int x=10;
        int y=++x;
        int z=y--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("------------------------");
        int a=3;
        int b=(++a)+(a++)+(a*10);
        System.out.println(a);
        System.out.println(b);
    }
}
