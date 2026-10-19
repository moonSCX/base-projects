package com.moon.funcation;

public class Test04 {
    /**
     * 定义一个方法,打印两个整数的最大值(改进)
     * @param args
     */
    public static void main(String[] args) {
        getMax(100,20);
    }

    public static void getMax(int n1,int n2){
        int max=n1>n2?n1:n2;
        System.out.println("最大值: "+max);
    }
}
