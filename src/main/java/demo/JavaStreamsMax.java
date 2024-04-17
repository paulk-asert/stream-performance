package demo;

import java.util.Arrays;
import java.util.Comparator;

public class JavaStreamsMax {
    private static Comparator<Integer> comparator = Comparator.comparingInt(Math::abs);

    public static int max(int[] nums) {
        return Arrays.stream(nums).max().getAsInt();
    }

    public static int maxAbs(int[] nums) {
        return Arrays.stream(nums).boxed().max(comparator).get();
    }
}
