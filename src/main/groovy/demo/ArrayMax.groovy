package demo

import groovy.transform.CompileStatic
import groovy.util.function.IntComparator

@CompileStatic
class ArrayMax {
    private static IntComparator maxAbs = (i, j) -> i.abs() <=> j.abs()

    static int max(int[] nums) {
        nums.max()
    }

    static int maxAbs(int[] nums) {
        nums.max(maxAbs)
    }

    static int maxAbs2(int[] nums) {
        nums.max((i, j) -> i.abs() <=> j.abs())
    }

    static int maxAbs3(int[] nums) {
        nums.maxComparing(Comparator.<Integer,Integer>comparing(n -> n.abs()))
    }
}
