package demo

import groovy.transform.CompileStatic

@CompileStatic
class StreamsMax {
    static int max(int[] nums) {
        Arrays.stream(nums).max().getAsInt()
    }

    static int maxAbs(int[] nums) {
        Arrays.stream(nums).boxed().max(Comparator.<Integer,Integer>comparing(n -> n.abs())).get()
    }
}
