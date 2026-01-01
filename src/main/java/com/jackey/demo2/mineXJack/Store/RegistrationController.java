package com.jackey.demo2.mineXJack.Store;

public class RegistrationController {
    public static void main(String[] args) {
        User user = new User(
          "Jackey", "jackey@gmail.com", "123A4"
        );

        User user1 = new User("Satyam", "satyam123@gmail.com", "342W");

        UserStore userStore = new UserStore();
        UserDataCollect userDataCollect = new UserDataCollect();
        userDataCollect.users.add(user);
        userDataCollect.users.add(user1);
        userStore.saveUser(user);
        userStore.saveUser(user1);
    }
}
