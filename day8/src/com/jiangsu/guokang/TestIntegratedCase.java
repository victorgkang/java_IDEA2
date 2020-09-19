package com.jiangsu.guokang;

import java.util.Arrays;

/**
 * @Description: 数据库的增加，删除，查看，替换。
 * @Author: victor
 * @Date: 2020/9/1  12:08
 */
public class TestIntegratedCase {

    static int[] array = new int[5];
    static int size = 0;

    public static void main(String[] args) {

        insert(0, 11);
        insert(1, 22);
        insert(2, 33);

        print();
        insert(3, 44);
        print();
        insert(4, 55);
        print();
        insert(5, 66);
        print();
        delete(5);
        print();
        delete(1);
        print();
    }

    public static void print() {                                   //遍历数组中所有的值
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

    }

    public static void insert(int position, int value) {         //插入一个新的value值
        if (size == array.length) {
            expand();
        }

        //判断有效下标
        if (position < 0 || position > size) {
            System.out.println("请输入一个在0~" + size + "范围内的值");
            return;
        }

        //讲有效元素，依次往后移动
        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        //新值的保存
        array[position] = value;
        size++;
    }

    public static void delete(int position) {                   //删除指定位置的值
        if (position < 0 || position >= size) {
            System.out.println("请输入一个在0~" + size + "范围内的值");
            return;
        }
        for (int i = position; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public static void expand() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public static void replace(int position, int value) {
        if (position < 0 || position >= size) {
            System.out.println("请输入一个在0~" + size + "范围内下标");

        }
        array[position] = value;
    }

    public static int search(int position) {
        if (position < 0 || position >= size) {
            System.out.println("请输入一个在0~" + size + "范围内下标");
            return -1;
        }
        return array[position];
    }

}
