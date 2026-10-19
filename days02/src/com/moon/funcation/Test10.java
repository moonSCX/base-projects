package com.moon.funcation;

public class Test10 {
    /**
     * 优惠计算器
     * 需求描述：
     * 小明要在电商平台购买三样家用电器，包括电压力锅、空气炸锅和烧水壶。电商平台有两种优惠方式：
     *
     * 拼单价优惠：每个商品在满足指定金额后可以享受减免。具体如下：
     * 电压力锅：原价1199元，满1199元减650元；
     * 空气炸锅：原价399元，满399元减50元；
     * 烧水壶：原价199元，满199元减30元。
     * 总价打6折：所有商品的总价打6折（拼单价优惠和总价打6折不能同时使用）。
     * 现在请你编写一个Java程序来计算小明购买这三样商品最少要花多少钱。
     * @param args
     */
    public static void main(String[] args) {
        double p1=1199;
        double p2=399;
        double p3=199;
        double sum=p1+p2+p3;
        double cost1 = fun1(sum);
        double cost2 = fun2(sum);
        double min =cost1<cost2?cost1:cost2;
        System.out.println("最小值: "+min);
    }

    public static double fun1(double n){
        return n-650-50-30;
    }

    public static double fun2(double n){
        return n*0.6;
    }
}
