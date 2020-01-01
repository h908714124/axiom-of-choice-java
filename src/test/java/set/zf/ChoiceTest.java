package set.zf;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChoiceTest {

    private Choice<String> choice = new Choice<>();

    @Test
    void choose() {

        Set<Set<String>> input = new HashSet<>();
        input.add(Collections.singleton("A"));
        input.add(Collections.singleton("B"));

        Set<String> expectation = new HashSet<>();
        expectation.add("A");
        expectation.add("B");

        Set<String> result = choice.choose(input);

        assertEquals(expectation, result);
    }
}