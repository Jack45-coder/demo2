package com.jackey.demo2.collection;

public class LRUCacheEasyController {
    public static void main(String[] args) {
        LRUCacheEasy lruCacheEasy = new LRUCacheEasy(3);

        lruCacheEasy.put(1, 1);
        lruCacheEasy.put(2, 2);
        lruCacheEasy.put(3, 1);
        lruCacheEasy.put(1, 4);
        lruCacheEasy.put(1, 5);
        lruCacheEasy.put(3, 6);

        lruCacheEasy.get(1);
        lruCacheEasy.display();
//
//        LinkedList<KVPair> list = new LinkedList<>();
//
//        list.add(new KVPair(1,1));
//        list.add(new KVPair(2,2));
//        list.add(new KVPair(3,1));
//
//        for(KVPair pair : list) {
//            System.out.println("Key: " + pair.key + ", Value: " + pair.value);
//        }

    }
}
