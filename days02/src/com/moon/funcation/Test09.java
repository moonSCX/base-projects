package com.moon.funcation;

public class Test09 {
    /**
     * 加法运算器
     * 需求描述：
     * 小明正在学习 Java 方法重载，他需要编写一个程序来实现不同数据类型数值的加法运算。请你帮他实现以下功能：
     *
     * 方法编写
     * 编写一个方法 add，接收两个整数参数，计算它们的和并返回结果。
     * 编写另一个方法 add，接收两个浮点数参数，计算它们的和并返回结果。这两个方法互为重载关系，即它们的方法名相同，但参数类型不同。
     * 在main方法中分别调用，并打印结果。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(11.1,22.2));
    }

    public static int add(int n1,int n2){
        return n1+n2;
    }

    public static double add(double d1,double d2){
        return d1+d2;
    }
}
