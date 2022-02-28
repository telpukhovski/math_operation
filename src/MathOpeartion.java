import java.util.HashSet;

public class MathOpeartion {

    private MathOpeartion() {

    }

    public static HashSet union(HashSet firstHashSet, HashSet secondHashSet) {
        HashSet<String> result = new HashSet<>(firstHashSet);
        result.addAll(secondHashSet);
        return result;
    }

    public static HashSet intersection(HashSet firstHashSet, HashSet secondHashSet) {
        HashSet<String> result = new HashSet(firstHashSet);
        result.retainAll(secondHashSet);
        return result;
    }

    public static HashSet minus(HashSet firstHashSet, HashSet secondHashSet) {
        HashSet<String> result = new HashSet<>(firstHashSet);
        result.removeAll(secondHashSet);
        return result;
    }

    public static HashSet difference(HashSet firstHashSet, HashSet secondHashSet) {
        HashSet<String> result = new HashSet<>(firstHashSet);
        result.addAll(secondHashSet);
        HashSet<String> tmp = new HashSet<>(firstHashSet);
        tmp.retainAll(secondHashSet);
        result.removeAll(tmp);
        return result;

    }
}
