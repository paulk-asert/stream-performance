package demo

import groovy.transform.CompileStatic

@CompileStatic
class StreamsMax {
//    static Comparator<Integer> maxAbs = Comparator.<Integer,Integer>comparing(Math::abs)
    private static Comparator<Integer> maxAbs =
        Comparator.<Integer>comparingInt(Math::abs)

    static int max(int[] nums) {
        nums.intStream().max().getAsInt()
    }

    static int maxAbs(int[] nums) {
        nums.stream().max(maxAbs).get()
    }

    static int maxAbs2(int[] nums) {
        nums.stream().max(Comparator.<Integer,Integer>comparing(n -> n.abs())).get()
    }

    static int maxAbs3(int[] nums) {
        nums.stream().max((i, j) -> i.abs() <=> j.abs()).get()
    }
}
