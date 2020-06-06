package collections.guava;

import Java.src.main.java.collections.guava.AddLoggingList;
import org.junit.jupiter.api.Test;

public class AddLoggingListTest {

  public void testAdd() {
    AddLoggingListTest<String> decoratorList = new AddLoggingList<>();
    decoratorList.add(0, "abc");
  }
}