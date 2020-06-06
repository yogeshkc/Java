package Java.concurrency;

import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class ThreadSafeCounter {
  @GuardedBy("this") private long count = 0;

  public synchronized long getCount() { return count; }

  public synchronized long increment() {
    if (count == Long.MAX_VALUE) {
      throw new IllegalStateException("Counter Overflow");
    }
    return ++count;
  }
}
