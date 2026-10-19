package com.moon.funcation;

import java.util.Scanner;

public class Test01 {
    /**
     * Scanner键盘录入
     * @param args
     */
    public static void main(String[] args) {
        /*
        操作步骤:
            1.导包: import java.util.Scanner;
            2.创建对象: Scanner sc = new Scanner(System.in);
            3.调用方法: String name = sc.next();
            目前涉及到面向对象的知识,现在直接照着抄就行,后面会学习到
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名: ");
        String name = sc.next();
        System.out.print("请输入年龄: ");
        int age = sc.nextInt();
        System.out.println("姓名: "+name+", 年龄: "+age);
    }
}
