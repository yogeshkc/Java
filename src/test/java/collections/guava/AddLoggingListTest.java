package collections.guava;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class AddLoggingListTest {

    @Test
    public void testAdd() {
        AddLoggingList<String> decoratorList = new AddLoggingList<>();
        decoratorList.add(0, "first-element");
        assertThat(decoratorList.getLog()).contains("Adding first-element to index 0");
        decoratorList.add(1, "second-element");
        assertThat(decoratorList.getLog()).contains("Adding first-element to index 0");
        assertThat(decoratorList.getLog()).contains("Adding second-element to index 1");

        try {
            decoratorList.add("cannot-add");
        } catch (UnsupportedOperationException ex) {
        }

        try {
            decoratorList.addAll(0, Arrays.asList("cannot-add"));
        } catch (UnsupportedOperationException ex) {
        }

        try {
            decoratorList.standardAdd("dummy");
        } catch (UnsupportedOperationException ex) {
        }

        try {
            decoratorList.standardAddAll(0, Arrays.asList("cannot-add"));
        } catch (UnsupportedOperationException ex) {
        }
    }

}