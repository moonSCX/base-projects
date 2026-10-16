package com.moon.yunsuanfu;

public class Test07 {
    /**
     * 赋值运算符
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        = += -= *= /= %=
         */

        int a = 10;
        System.out.println(a);
        a += 20; // a = a + 20
        System.out.println(a);

        /*
        注意: 扩展赋值运算符自带强转效果
         */
        double d=22.3;
        int c=10;
        c+=d;
        System.out.println(c);
    }
}
