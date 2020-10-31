package com.structural.abstractFactory.product.user;

public class RedisUser extends IUser {

    @Override
    public void insertIntoUser() {
        System.out.println("Redis insert into user");

    }
    
}
