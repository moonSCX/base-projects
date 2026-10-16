package com.moon.yunsuanfu;

public class Test04 {
    /**
     * 自增自减运算符 ++,--
     * @param args
     */
    public static void main(String[] args) {
        /*
        1.单独使用(在前在后没什么区别)
         */
        int a=10;
        a++;
//        ++a;
        System.out.println(a);
        int b=20;
        b--;
//        --b;
        System.out.println(b);

        /*
        2.参与运算使用
         */
        int c=10;
        int d=++c;
        System.out.println(c);
        System.out.println(d);

        int e=10;
        int f=e++;
        System.out.println(e);
        System.out.println(f);

    }
}
