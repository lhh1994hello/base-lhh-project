package com.base.gof.single;

/**
 * @author lhh
 * @date 2019/6/5 15:21
 * @Description:
 */
public class BadSynchronizedSingleton {
    //一个静态的实例
    private static BadSynchronizedSingleton synchronizedSingleton;
    //私有化构造函数

    private BadSynchronizedSingleton() {
    }

    public synchronized static BadSynchronizedSingleton getSynchronizedSingleton() {
        if (synchronizedSingleton == null) {
            synchronizedSingleton = new BadSynchronizedSingleton();
        }
        return synchronizedSingleton;
    }

}
