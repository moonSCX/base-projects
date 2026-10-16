package com.moon.yunsuanfu;

public class Test11 {
    /**
     * 三元运算符
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        格式:
            判断条件 ? 值1 : 值2
            如果条件为true,返回值1
            如果条件为false,返回值2
         */
        int n1 = 100;
        int n2 = 20;
        int max = n1 > n2 ? n1 : n2;
        System.out.println(max);
    }
}
