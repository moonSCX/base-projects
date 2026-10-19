package com.moon.yunsuanfu;

public class Test14 {
    /**
     * 计算外卖订单的最低花费
     * 需求描述：
     * 小明想点一份外卖，他选择了以下三样菜品：
     *
     * 鱼香肉丝：24元
     * 油炸花生米：8元
     * 米饭：3元
     * 外卖商家提供了两种优惠方式（折扣和满减不能同时使用）：
     *
     * 折扣优惠：订单享受8折优惠券。
     * 满减优惠：订单满30元可以使用15元优惠券。
     * @param args
     */
    public static void main(String[] args) {
        double p1=24;
        double p2=8;
        double p3=3;
        double sum=p1+p2+p3;

        double cost1=sum*0.8;
        double cost2=0;
        if (sum>30){
            cost2=sum-15;
        }
        double min=cost1<cost2?cost1:cost2;
        System.out.println(min);
    }
}
