package com.structural.abstractFactory.factory;

import com.structural.abstractFactory.product.user.IUser;
import com.structural.abstractFactory.product.user.MySQLUser;

public class MySQLFactory extends Factory {

    @Override
    public IUser getUser() {
        return new MySQLUser();
    }
}
