package com.creative.abstractFactory.factory;

import com.creative.abstractFactory.product.user.IUser;
import com.creative.abstractFactory.product.user.RedisUser;

public class RedisFactory extends Factory {

    @Override
    public IUser getUser() {
        return new RedisUser();
    }
    
}
