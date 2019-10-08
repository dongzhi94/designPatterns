package com.dong.zhi.singleton.test;


import com.dong.zhi.singleton.register.BeanFactory;

import java.util.concurrent.CountDownLatch;

public class BeanFactoryTest {

    public static void main(String[] args) {
        //使用发令枪模拟线程万箭齐发
        int count = 100;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        Long start = System.currentTimeMillis();
        for (int i = 0; i < count; i ++){
            new Thread() {
                @Override
                public void run() {
                    //阻塞等待，该方法表示，count减为0之后继续执行，即效果是100个线程全部创建后，一起向下执行
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    LazyTwo lazyOne = LazyTwo.getInstance();
                    Object obj = BeanFactory.getBean("com.dong.zhi.duck01.Duck");
                    //1570501735697:com.dong.zhi.duck01.Duck@549c1a2a
                    //1570501735697:com.dong.zhi.duck01.Duck@2c54ae2
                    //不加锁的情况下。非线程安全
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            }.start();
            countDownLatch.countDown();
        }

        //正常的countdownLatch用法是在这里进行await，等待所有线程执行完成后主线程继续执行
        try {
//            countDownLatch.await();
            Long end = System.currentTimeMillis();
            System.out.println("耗时："+ (end - start));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
