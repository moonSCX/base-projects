package com.moon.funcation;

public class Test05 {
    /**
     * 定义一个方法,打印两个整数的最大值(二次改进)
     * 增加返回值
     * @param args
     */
    public static void main(String[] args) {
        int max = getMax(100, 20);
        System.out.println("最大值: "+max);
    }

    public static int getMax(int n1,int n2){
        return n1>n2?n1:n2;
    }
}
