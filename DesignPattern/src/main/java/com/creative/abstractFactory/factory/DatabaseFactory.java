package com.creative.abstractFactory.factory;

public class DatabaseFactory {
    public static Factory getFactory(String db_name) {
        switch (db_name) {
            case "MySQL":
                return new MySQLFactory();
            case "Redis":
                return new RedisFactory();
            default:
                return null;
        }
    }
}
