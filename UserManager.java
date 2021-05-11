package com.company;

public class UserManager {
    public void add(User user){
        System.out.println(user.getId()+" Numaralı Kullanıcı eklenmiştir.");
    }
    public void addMultiple(User[] users){
        for (User user:users){
            add(user);
        }
    }

}
