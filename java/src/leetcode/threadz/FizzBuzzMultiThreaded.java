package leetcode.threadz;

// https://leetcode.com/problems/fizz-buzz-multithreaded/

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private AtomicInteger x;
    private final Object lock = new Object();

    public FizzBuzz(int n) {
        this.n = n;
        this.x = new AtomicInteger(1);
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (this.x.get() <= this.n) {
            synchronized (lock) {
                if (this.x.get() % 3 == 0 && this.x.get() % 5 != 0) {
                    printFizz.run();
                    this.x.getAndIncrement();
                    lock.notifyAll();
                } else {
                    lock.wait();
                }
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (this.x.get() <= this.n) {
            synchronized (lock) {
                if (this.x.get() % 3 != 0 && this.x.get() % 5 == 0) {
                    printBuzz.run();
                    this.x.getAndIncrement();
                    lock.notifyAll();
                } else {
                    lock.wait();
                }
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (this.x.get() <= this.n) {
            synchronized (lock) {
                if (this.x.get() % 3 == 0 && this.x.get() % 5 == 0) {
                    printFizzBuzz.run();
                    this.x.getAndIncrement();
                    lock.notifyAll();
                } else {
                    lock.wait();
                }
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (this.x.get() <= this.n) {
            synchronized (lock) {
                if (this.x.get() % 3 != 0 && this.x.get() % 5 != 0) {
                    printNumber.accept(this.x.get());
                    this.x.getAndIncrement();
                    lock.notifyAll();
                } else {
                    lock.wait();
                }
            }
        }
    }
}
