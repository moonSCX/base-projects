package com.moon.yunsuanfu;

public class Test12 {
    /**
     * 练习: 从3个整数中找到最大值
     * @param args
     */
    public static void main(String[] args) {
        int x=100;
        int y=20;
        int z=150;

        int tempMax=x>y?x:y;
        int max=tempMax>z?tempMax:z;
        System.out.println("最大值: "+max);
    }
}
