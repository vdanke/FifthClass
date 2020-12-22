package org.step.threads.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadExceptionHandling {

    private static final Map<Integer, String> DATABASE;
    private static final Map<Integer, String> DUMP;

    static {
        DATABASE = new HashMap<>();
        DATABASE.put(1, "first");
        DATABASE.put(2, "second");
        DUMP = new HashMap<>();
    }

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                if (throwable.getClass().isAssignableFrom(DBException.class)) {
                    DBException ex = (DBException) throwable;
                    System.out.printf("Value in DB not found by key %d%n", ex.getKey());
                    DUMP.put(ex.getKey(), "Our value");
                }
            }
        });

        Thread t = new Thread() {
            @Override
            public void run() {
                String info = new ThreadExceptionHandling().getInfo(5);
                System.out.println("Info is: " + info);
            }
        };

//        t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread thread, Throwable throwable) {
//                if (throwable.getClass().isAssignableFrom(DBException.class)) {
//                    DBException ex = (DBException) throwable;
//                    System.out.printf("Value in DB not found by key %d%n", ex.getKey());
//                }
//            }
//        });

        t.start();
    }

    public String getInfo(Integer key) {
        if (DATABASE.containsKey(key)) {
            return DATABASE.get(key);
        }
        throw new DBException("Oops", key);
    }

    public String updateInfo(Integer key, String value) {
        return DATABASE.put(key, value);
    }

    public static class DBException extends RuntimeException {

        private final Integer key;
//        private final String value;

        public DBException(String message, Integer key) {
            super(message);
            this.key = key;
        }

        public Integer getKey() {
            return this.key;
        }
    }
}
