package com.jackey.demo2.mineXJack.Store;

import java.io.FileWriter;
import java.io.IOException;

public class UserStore {
    public static void saveUser(User user) {
        try(FileWriter fw = new FileWriter("users.txt", true)){
            fw.write(user.toString() + "\n");
            System.out.println("USer registered successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
