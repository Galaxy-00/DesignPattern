package com.structural.abstractFactory;

import com.structural.abstractFactory.factory.DatabaseFactory;
import com.structural.abstractFactory.factory.Factory;
import com.structural.abstractFactory.factory.MySQLFactory;
import com.structural.abstractFactory.factory.RedisFactory;
import com.structural.abstractFactory.product.user.IUser;

public class DatabaseTest {
    public static void main(String[] args) {
        System.out.println("----------abstract factory------------");
        Factory factory = new MySQLFactory();
        IUser user = factory.getUser();
        user.insertIntoUser();

        factory = new RedisFactory();
        user = factory.getUser();
        user.insertIntoUser();

        // 简单工厂
        System.out.println("----------simple factory------------");
        Factory factory2 = DatabaseFactory.getFactory("MySQL");
        IUser user2 = factory2.getUser();
        user2.insertIntoUser();

        factory2 = DatabaseFactory.getFactory("Redis");
        user2 = factory2.getUser();
        user2.insertIntoUser();

        try {
            // 反射
            System.out.println("----------reflect------------");
            Class<?> classFactory = Class.forName("com.structural.abstractFactory.factory.MySQLFactory");
            Object objectFactory = classFactory.getDeclaredConstructor().newInstance();
            Factory factory3 = (Factory) objectFactory;
            IUser user3 = factory3.getUser();
            user3.insertIntoUser();

            classFactory = Class.forName("com.structural.abstractFactory.factory.RedisFactory");
            factory3 = (Factory)classFactory.getDeclaredConstructor().newInstance();
            user3 = factory3.getUser();
            user3.insertIntoUser();
        } catch (Exception e) {

        }
    }

}
