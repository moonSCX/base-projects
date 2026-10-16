package com.moon.yunsuanfu;

public class Test09 {
    /**
     * 逻辑运算符
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        & | ! ^ && ||
         */

        // & 与 遇false则false
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(false & false);

        System.out.println("------------------------------------");

        // | 或 遇true则true
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(false | false);

        System.out.println("------------------------------------");

        // ! 非 取反
        System.out.println(!false);
        System.out.println(!true);

        System.out.println("------------------------------------");

        // ^ 异或 两边相同为false,不同为true
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);

        System.out.println("------------------------------------");

        // && 短路与 左边为false,右边不执行
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("------------------------------------");

        // || 短路或 左边为true,右边不执行
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);
    }
}

