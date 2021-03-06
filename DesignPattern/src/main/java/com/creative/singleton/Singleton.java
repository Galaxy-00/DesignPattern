package com.creative.singleton;

// 懒汉式, 通过内部静态类实现, 线程安全
public class Singleton {
   private static class LazyHolder {
      private static final Singleton INSTANCE = new Singleton();
   }

   private Singleton() {
   }

   public static final Singleton getInstance() {
      return LazyHolder.INSTANCE;
   }
}
