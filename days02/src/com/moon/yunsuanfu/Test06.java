package com.moon.yunsuanfu;

public class Test06 {
    /**
     * 类型转换(隐式/强制)
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        隐式转换:
            小的给大的赋值,可以直接赋值
            byte,short,char ->int -> long -> float -> double
            注意: byte,short,char在进行运算时会提升至int
         */
        int n1 = 20;
        double d1 = n1;
        System.out.println(n1);
        System.out.println(d1);

        // 取值范围小的取值范围大的进行相加,小的会先提升成大的,再进行操作
        double dd=22.2;
        int nn=20;
        double res=nn+dd;
        System.out.println(res);

        byte b1 = 10;
        byte b2 = 20;
//        byte b3=b1+b2;
//        int b3=b1+b2;
//        byte b3 = (byte) (b1 + b2);


        /*
        强制转换:
            大的给小的赋值,需要强转
            格式:
                目标数据类型 变量名 = (目标数据类型) 被强转的数据
         */
        double d2=3.14;
        int n2=(int) d2;
        System.out.println(n2);
    }
}
