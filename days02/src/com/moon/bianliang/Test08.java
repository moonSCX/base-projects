package com.moon.bianliang;

public class Test08 {
    /**
     * 定义专辑信息并打印到控制台
     * 需求描述：
     * 请根据以下专辑信息，选择合适的变量类型进行存储，并在控制台打印这些信息：
     * <p>
     * 名字：范特西
     * 发行日期：2001年9月14日
     * 曲目数量：10
     * 演唱：周杰伦
     * 发行价格：9.9
     *
     * @param args
     */
    public static void main(String[] args) {
        String name = "范特西";
        String date = "2001年9月14日";
        int count = 10;
        String singer = "周杰伦";
        double price = 9.9;
        System.out.println("名字: " + name);
        System.out.println("发行日期: " + date);
        System.out.println("曲目数量: " + count);
        System.out.println("演唱: " + singer);
        System.out.println("发行价格: " + price);
    }
}
