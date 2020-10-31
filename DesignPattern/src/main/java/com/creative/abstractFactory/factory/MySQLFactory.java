package com.creative.abstractFactory.factory;

import com.creative.abstractFactory.product.user.IUser;
import com.creative.abstractFactory.product.user.MySQLUser;

public class MySQLFactory extends Factory {

    @Override
    public IUser getUser() {
        return new MySQLUser();
    }
}
