package com.moon.funcation;

public class Test07 {
    /**
     * 方法重载:
     * 在同一个类中.方法名相同,形参不同(形参的个数,种类,顺序),与返回值无关
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(11.1, 22.2));
        System.out.println(add(11.1, 22.2, 33.3));
    }

    /**
     * 定义两个整数相加的和
     *
     * @param n1
     * @param n2
     * @return
     */
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * 定义三个整数相加的和
     *
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    /**
     * 定义两个小数相加的和
     *
     * @param d1
     * @param d2
     * @return
     */
    public static double add(double d1, double d2) {
        return d1 + d2;
    }

    /**
     * 定义三个小数相加的和
     *
     * @param d1
     * @param d2
     * @param d3
     * @return
     */
    public static double add(double d1, double d2, double d3) {
        return d1 + d2 + d3;
    }
}
