package com.jk.work.java.basis.collection.array;

import java.util.Arrays;

/**
 * @Author: kang.jiang
 * @Description:
 * @Date: create in 2023/5/23 上午10:42
 */
public class ArrayDemo {

    // 测试冒泡排序
    public static void main(String[] args) {

        int[] array = new int[]{3,5,2,1};

        System.out.println(Arrays.toString(JkArrayUtils.bubbleSort(array)));
    }



}
