package example.atomic;

import com.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * AtomicIntegerFieldUpdater 是原子性更新某一个类的一个实例的某一个字段
 */
@Slf4j
@ThreadSafe
public class AtomicIntegerFieldUpdaterExample {

    private static AtomicIntegerFieldUpdater<AtomicIntegerFieldUpdaterExample> updater =
            AtomicIntegerFieldUpdater.newUpdater(AtomicIntegerFieldUpdaterExample.class, "count");

    //使用AtomicIntegerFieldUpdater 必须使用volatile，非static的字段
    public volatile int count = 100;

    public static void main(String[] args) {

        AtomicIntegerFieldUpdaterExample example5 = new AtomicIntegerFieldUpdaterExample();

        if (updater.compareAndSet(example5, 100, 120)) {
            log.info("update success 1, {}", example5.getCount());
        }

        if (updater.compareAndSet(example5, 100, 120)) {
            log.info("update success 2, {}", example5.getCount());
        } else {
            log.info("update failed, {}", example5.getCount());
        }
    }

    public int getCount() {
        return count;
    }
}
