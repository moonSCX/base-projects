package com.moon.yunsuanfu;

public class Test13 {
    /**
     * 定义类并完成变量定义与类型转换任务
     * 需求描述：
     * 请定义一个类，并在 main 方法中完成以下任务：
     *
     * 分别定义以下类型的变量，进行初始化，并在控制台分别输出每个变量的值
     * int 类型变量
     * long 类型变量
     * double 类型变量
     * boolean 类型变量
     * 将 double 类型变量的值赋给 int 类型变量（注意：可能会丢失精度）。
     * 在控制台输出 int 类型变量的值。
     * 将 int 类型变量赋值给 double 类型变量：
     * 在控制台输出 double 类型变量的值。
     * @param args
     */
    public static void main(String[] args) {
        int n1=10;
        long l1=100L;
        double d1=3.14;
        boolean b1=true;

        int n2=(int)d1;
        System.out.println(n2);
        double d2=n1;
        System.out.println(d2);
    }
}
