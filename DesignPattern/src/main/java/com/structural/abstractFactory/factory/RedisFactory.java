package com.structural.abstractFactory.factory;

import com.structural.abstractFactory.product.user.IUser;
import com.structural.abstractFactory.product.user.RedisUser;

public class RedisFactory extends Factory {

    @Override
    public IUser getUser() {
        return new RedisUser();
    }
    
}
