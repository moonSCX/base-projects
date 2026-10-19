package com.moon.funcation;

public class Test02 {
    public static void me(){
        System.out.println("点菜");
        System.out.println("吃菜");
    }
    /**
     * 方法的注意事项:
     *     1.方法之间是平级关系,不能嵌套定义
     *     2.方法不调用就不执行
     *     3.方法的执行顺序与调用顺序无关
     *
     * 方法的好处:
     *     1.提高了代码的阅读性,维护性
     *     2.提高代码的复用性
     * @param args
     */
    public static void main(String[] args) {
        farmer();
        coke();
        me();
    }

    public static void coke(){
        System.out.println("买菜");
        System.out.println("洗菜");
        System.out.println("做菜");
    }

    public static void farmer(){
        System.out.println("除草");
        System.out.println("耕地");
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("收割");
    }

    public static void eat(){
        System.out.println("今天吃了3顿饭");
    }
}
