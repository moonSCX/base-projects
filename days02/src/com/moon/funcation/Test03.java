package com.moon.funcation;

public class Test03 {
    /**
     * 定义一个方法,打印两个整数的最大值
     * @param args
     */
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax(){
        int n1=10;
        int n2=20;
        int max=n1>n2?n1:n2;
        System.out.println("最大值: "+max);
    }
}
