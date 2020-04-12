package collections.guava;

import com.google.common.collect.ForwardingList;

import java.io.Serializable;
import java.util.List;

/*
This is a rather useless list. All it does is add the current size of the list
to any element that is inserted into it. It also converts the incoming objects
into their string representations
 */
public class SizeAppenderList<T extends Serializable>
    extends ForwardingList<String> {
  protected List<String> delegate() { return null; }
}
