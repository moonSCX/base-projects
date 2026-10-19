package com.moon.bianliang;

public class UserInfo {
    /**
     * 创建 UserInfo 类并输出用户信息
     * 需求描述：
     * 请新建一个类 UserInfo，并在 main 方法中完成以下任务：
     *
     * 定义合适类型的变量，存储以下用户信息：
     * 用户姓名：moon
     * 年龄：20
     * 性别：男
     * 身高：1.85
     * 输出用户信息：
     * 在控制台逐行输出用户信息，每个属性占一行。
     * @param args
     */
    public static void main(String[] args) {
        String name="moon";
        int age=20;
        double height=1.85;
        char gender='男';
        System.out.println("姓名: "+name);
        System.out.println("年龄: "+age);
        System.out.println("身高: "+height);
        System.out.println("性别: "+gender);
    }
}
