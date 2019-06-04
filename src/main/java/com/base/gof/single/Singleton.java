package com.base.gof.single;

/**
 * @author lhh
 * @date 2019/6/4 17:39
 * @Description: 单例模式
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    //给出一个公共的静态方法返回一个单一实例，不考虑并发问题
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
