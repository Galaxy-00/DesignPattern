package com.structural.abstractFactory.factory;

import com.structural.abstractFactory.product.user.IUser;

public abstract class Factory {
    public abstract IUser getUser();
}
