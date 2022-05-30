package com.web.easyshop.web.Util;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 轮训算法
 */
public class Rotation {

    // ConcurrentHashMap 是 J.U.C 包里面提供的一个线程安全并且高效的 HashMap，所以
    // ConcurrentHashMap 在并发编程的场景中使用的频率比较高
    private static ConcurrentHashMap concurrentHashMapmap = new ConcurrentHashMap();

    // 一、AtomicInteger介绍
    // ①.支持原子操作的Integer类
    // ②.主要用于在高并发环境下的高效程序处理。使用非阻塞算法来实现并发控制
    private static AtomicInteger atomicIntegeratomicInteger = new AtomicInteger();

    private static List ListipStrs = Arrays.asList("192.168.1.121", "192.168.1.122", "192.168.1.123");

    public static Object getIp()
    {
        // 先获取自增，再获取值
        int num = atomicIntegeratomicInteger.incrementAndGet();
        // 如果到达最后一个则还原为第一个
        if(num > ListipStrs.size())
        {
            atomicIntegeratomicInteger.set(1);
            num = atomicIntegeratomicInteger.get();

        }

        return ListipStrs.get(num - 1);
    }
}
