package set.zf;

import java.util.HashSet;
import java.util.Set;

public class Choice<E> {

    private void validate(Set<E> set) {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Cannot select from an empty set.");
        }
    }

    public Set<E> choose(Set<Set<E>> sets) {
        Set<E> result = new HashSet<>(sets.size());
        for (Set<E> set : sets) {
            validate(set);
            E chosen = set.iterator().next();
            result.add(chosen);
        }
        return result;
    }
}
