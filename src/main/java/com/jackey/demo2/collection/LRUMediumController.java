package com.jackey.demo2.collection;

public class LRUMediumController {
    public static void main(String[] args) {
        LRUMedium lruMedium = new LRUMedium(3);
        lruMedium.put(1,1);
        lruMedium.put(1,1);
        lruMedium.put(1,1);
//        lruMedium.put(1, 1);
//        lruMedium.put(2, 2);
//        lruMedium.put(3, 1);
//        lruMedium.put(1, 4);
//        lruMedium.put(1, 5);
//        lruMedium.put(3, 6);
//
//        System.out.println(lruMedium.sizeOfMap());
//
//        lruMedium.put(1, 7);
//        lruMedium.put(5, 7);
//
//        System.out.println(lruMedium.sizeOfMap());
//
//        lruMedium.put(11, 7);
//        lruMedium.put(15, 7);
//        lruMedium.put(17, 7);

        System.out.println(lruMedium.sizeOfMap());
        lruMedium.display();
    }
}
