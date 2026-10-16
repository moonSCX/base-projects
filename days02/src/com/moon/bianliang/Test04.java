package com.moon.bianliang;

public class Test04 {
    /**
     * 变量注意事项
     * @param args
     */
    public static void main(String[] args) {
        /*
        1.未定义的变量不能直接使用
        报错: java: 找不到符号
              符号:   变量 num
              位置: 类 com.moon.bianliang.Test04
         */
        int age=20;
        System.out.println(age);
//        System.out.println(num);

        /*
        2.变量是什么类型的就装什么类型的数据
        报错: java: 不兼容的类型: 从double转换到int可能会有损失
         */
        int money=100;
        System.out.println(money);
//        money=3.14;

        /*
        3.变量只在自己的大括号范围内有效
        报错: java: 找不到符号
              符号:   变量 num
              位置: 类 com.moon.bianliang.Test04
         */
        System.out.println(age);
        {
            int num=10;
            System.out.println(num);
        }
//        System.out.println(num);

        /*
        4.同一个范围内变量名称不能一样
        报错: java: 已在方法 main(java.lang.String[])中定义了变量 num
         */
        {
            int num=20;
            System.out.println(num);
//            int num=40;
//            System.out.println(num);
        }

        /*
        5.变量定义的时候可以不赋初始值,但使用之前一定要赋值
        报错: java: 可能尚未初始化变量salary
         */
        int salary;
//        System.out.println(salary);

        /*
        一条语句可以定义多个变量,中间使用,分隔
         */
        int a=10,b=20,c=30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
