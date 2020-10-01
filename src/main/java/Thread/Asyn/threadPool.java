package Thread.Asyn;

import java.util.concurrent.*;

/**
 * 阿里代码规约：手动创建线程池,效果会更好哦
 * https://blog.csdn.net/loulanyue_/article/details/100166717
 * https://blog.csdn.net/sinat_36710456/article/details/107221342
 */
public class threadPool {

    /**
     * 项目中创建多线程时，使用常见的三种线程池创建方式，单一、可变、定长都有一定问题，
     * 原因是FixedThreadPool和SingleThreadExecutor底层都是用LinkedBlockingQueue实现的，
     * 这个队列最大长度为Integer.MAX_VALUE，容易导致OOM。所以实际生产一般自己通过ThreadPoolExecutor的7个参数，自定义线程池：
     */
    ExecutorService threadPool=new ThreadPoolExecutor(2,5,
            1L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(3),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    /*
        一、创建线程池的7个参数
        1、corePoolSize线程池的核心线程数
        2、maximumPoolSize能容纳的最大线程数
        3、keepAliveTime空闲线程存活时间
        4、unit 存活的时间单位
        5、workQueue 存放提交但未执行任务的队列
        6、threadFactory 创建线程的工厂类
        7、handler 等待队列满后的拒绝策略
     */

    // 线程池
    static ExecutorService taskExe = Executors.newFixedThreadPool(10);

    /*
        二、规避资源耗尽的风险，生产上的推荐解法：

     */
}
