package com.moon.funcation;

public class Test06 {
    /**
     * 练习:
     *  1.设计一个计算2个小数和的方法
     *  2.设计一个计算3个整数最小值的方法
     *  3.设计一个方法,能够打印出用户的个人信息
     * @param args
     */
    public static void main(String[] args) {
        double sum = getSum(11.1, 22.2);
        System.out.println(sum);

        int min = getMin(11, 10, 99);
        System.out.println(min);

        printInfo("moon",18,180.1,'男');
    }

    public static double getSum(double d1,double d2){
        return d1+d2;
    }

    public static int getMin(int n1,int n2,int n3){
        int tempMin=n1<n2?n1:n2;
        int min=tempMin<n3?tempMin:n3;
        return min;
    }

    public static void printInfo(String name,Integer age,double height,char gender){
        System.out.println("姓名: "+name);
        System.out.println("年龄: "+age);
        System.out.println("身高: "+height);
        System.out.println("性别: "+gender);
    }
}
