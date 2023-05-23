package com.jk.work.java.basis.collection.array;

import java.util.Arrays;

/**
 * @Author: kang.jiang
 * @Description:
 * @Date: create in 2023/5/23 上午10:42
 */
public class JkArrayUtils {

    /**
     * 反转数组
     * @param objects
     * @return
     */
    public static Object[] reverseArray(Object[] objects) {

        Object[] obj = new Object[objects.length];

        // 第一种写法
        /*
        int index = 0;

        for (int i = objects.length - 1; i >= 0; i--) {
            obj[index] = objects[i];
            index++;
        }
        */

        // 第二种写法
        for (int i = 0, j = objects.length - 1; i < obj.length; i++, j--) {
            obj[i] = objects[j];
        }

        return obj;
    }

    /**
     * 打印数组 (换行)
     * @param objects
     */
    public static void printArray(Object[] objects){
        for (Object object : objects){
            System.out.println(object);
        }
    }

    /**
     * 冒泡排序
     * @return
     */
    public static int[] bubbleSort(int[] array) {

        int num = 0;
        // 优化冒泡，
        // 如果数组已经是排好序了，通过第一轮的冒泡我们就可以得出结论
        boolean flag = false;

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] > array[j]) {
                    num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return array;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {

        Integer[] arrays = new Integer[]{1,4,2,3};

        printArray(reverseArray(arrays));
    }
    
}
