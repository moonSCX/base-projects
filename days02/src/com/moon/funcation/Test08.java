package com.moon.funcation;

public class Test08 {
    /**
     * 整数加法计算器
     * 需求描述：
     * 开发一个简单的计算器程序，用于计算两个整数的和。请你帮他实现以下功能：
     *
     * 编写一个方法，接收两个整数参数，返回它们的和。
     * 在 main 方法中：
     * 定义两个整数变量并赋值，调用你编写的方法计算它们的和。
     * 使用 System.out.println 打印结果，格式为：{第一个数} + {第二个数} = {和}
     * 测试：分别计算 5 + 3 和 -10 + 7 的结果。
     * @param args
     */
    public static void main(String[] args) {
        int sum = getSum(5, 3);
        System.out.println("5 + 3 = "+sum);
    }

    public static int getSum(int n1,int n2){
        return n1+n2;
    }
}
