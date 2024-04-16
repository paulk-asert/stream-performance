package demo;

import java.util.Arrays;
import java.util.Comparator;

public class JavaStreamsMax {
    public static int max(int[] nums) {
        return Arrays.stream(nums).max().getAsInt();
    }

    public static int maxAbs(int[] nums) {
        return Arrays.stream(nums).boxed().max(Comparator.comparingInt(Math::abs)).get();
    }
}
