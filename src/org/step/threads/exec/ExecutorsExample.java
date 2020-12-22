package org.step.threads.exec;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        Runnable runnable = new Runnable() {
            public int count;

            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    count++;
                }
                System.out.println(count);
            }
        };
        Callable<Integer> counter = new Callable<Integer>() {
            public int count;

            @Override
            public Integer call() throws Exception {
                for (int i = 0; i < 100000; i++) {
                    count++;
                }
                return count;
            }
        };
        Integer integer = callableSingleThreadExecutor(counter);

        System.out.println(integer);
    }

    public static Integer callableSingleThreadExecutor(Callable<Integer> callable) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService single = Executors.newSingleThreadExecutor();
        Future<Integer> integerFuture = single.submit(callable);
        gracefulShutdown(single);
        return integerFuture.get(10, TimeUnit.MILLISECONDS);
    }

    public static void scheduledThreadPoolExecutor(Runnable runnable) throws InterruptedException {
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(3);

//        scheduled.schedule(runnable, 500, TimeUnit.MILLISECONDS); Start in 500 ms
//        scheduled.scheduleWithFixedDelay(runnable, 0, 1, TimeUnit.SECONDS);
        scheduled.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);

        Thread.sleep(5000);

        gracefulShutdown(scheduled);
    }

    public static void workStealingThreadPoolExecutor(Runnable runnable) {
        ExecutorService workStealing = Executors.newWorkStealingPool(3);
        workStealing.submit(runnable);
        workStealing.submit(runnable);
        gracefulShutdown(workStealing);
    }

    public static void fixedThreadPoolExecutor(Runnable runnable) {
        ExecutorService fixed = Executors.newFixedThreadPool(4);
        fixed.submit(runnable);
        fixed.submit(runnable);
        gracefulShutdown(fixed);
    }

    public static void cachedThreadPoolExecutor(Runnable runnable) {
        ExecutorService cached = Executors.newCachedThreadPool();
        cached.submit(runnable);
        cached.submit(runnable);
        shutdown(cached);
    }

    public static void singleThreadPoolExecutor(Runnable runnable) {
        ExecutorService single = Executors.newSingleThreadExecutor();
        single.submit(runnable);
        single.submit(runnable);
        gracefulShutdown(single);
    }

    public static void shutdown(ExecutorService ex) {
        if (!ex.isShutdown()) {
            ex.shutdownNow();
        }
    }

    public static void gracefulShutdown(ExecutorService ex) {
        if (!ex.isShutdown()) {
            ex.shutdown();
        }
    }
}
