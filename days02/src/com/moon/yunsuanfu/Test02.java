package com.moon.yunsuanfu;

public class Test02 {
    /**
     * 数值拆分
     * @param args
     */
    public static void main(String[] args) {
        /*
        个位: num%10
        十位: num/10%10
        百位: num /10/10%10

        规律:
        x位: num/%10
         */
        int num=299;
        int ge=num%10;
        int shi=num/10%10;
        int bai=num/100%10;
        System.out.println(num+" 的个位: "+ge);
        System.out.println(num+" 的十位: "+shi);
        System.out.println(num+" 的百位: "+bai);
    }
}
