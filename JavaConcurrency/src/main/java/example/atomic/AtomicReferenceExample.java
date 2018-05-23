package example.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {
    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args) {
        count.compareAndSet(0, 2); // 2   是0的时候赋值成2
        count.compareAndSet(0, 1); // no  是0的时候赋值成1
        count.compareAndSet(1, 3); // no
        count.compareAndSet(2, 4); // 4
        count.compareAndSet(3, 5); // no
        System.out.println("count:"+count.get());
    }
}
