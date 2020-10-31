package com.structural.abstractFactory.product.user;

// 处理MySQl中user表的操作
public class MySQLUser extends IUser {

    @Override
    public void insertIntoUser() {
        System.out.println("MySQL insert into user");
    }
}
