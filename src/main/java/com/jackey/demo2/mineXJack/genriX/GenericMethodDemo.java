package com.jackey.demo2.mineXJack.genriX;

public class GenericMethodDemo{
    public static <T> void printArray(T[] array){
      for(T element : array){
          System.out.print(element);
      }
        System.out.println();
    }

    public static void main(String[] args) {
       Integer[] intArr = {1,2,3,4,5};
       String[] strArr = {"Jack", "Ankit", "Adarsh", "Simpal"};
       Double[] dblArr = {10.5, 54.75, 98.99, 24.50};

       printArray(intArr);
       printArray(strArr);
       printArray(dblArr);
    }
}
