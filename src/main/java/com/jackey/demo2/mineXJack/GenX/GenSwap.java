package com.jackey.demo2.mineXJack.GenX;

import javax.imageio.stream.IIOByteBuffer;

public class GenSwap {
    public static<T> void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        swap(nums, 2, 4);
        for(Integer n : nums){
            System.out.print(n + " ");
        }

        System.out.println();

        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        swap(fruits, 1, 3);
        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }

    }
}
